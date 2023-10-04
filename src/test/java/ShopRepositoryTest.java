import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    @Test
    public void TestProductDelit2() {
        ShopRepository rep = new ShopRepository();

        Product product1 = new Product(1, "Телевизор", 50000);
        Product product2 = new Product(2, "Телефон", 20000);
        Product product3 = new Product(3, "Холодильник", 70000);

        rep.add(product1);
        rep.add(product2);
        rep.add(product3);
        rep.remove(2);
        Product[] actual = rep.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void TestProductDelit3() {
        ShopRepository rep = new ShopRepository();

        Product product1 = new Product(1, "Телевизор", 50000);
        Product product2 = new Product(2, "Телефон", 20000);
        Product product3 = new Product(3, "Холодильник", 70000);

        rep.add(product1);
        rep.add(product2);
        rep.add(product3);
        rep.remove(3);
        Product[] actual = rep.findAll();
        Product[] expected = {product1, product2};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void TestProductDelit() {
        ShopRepository rep = new ShopRepository();

        Product product1 = new Product(1, "Телевизор", 50000);
        Product product2 = new Product(2, "Телефон", 20000);
        Product product3 = new Product(3, "Холодильник", 70000);

        rep.add(product1);
        rep.add(product2);
        rep.add(product3);


        Assertions.assertThrows(NotFoundException.class, () -> rep.remove(22) );

    }



}