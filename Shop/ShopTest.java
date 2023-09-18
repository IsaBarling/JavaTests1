package seminars.first.Shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    private Shop shop;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setUp() {
        product1 = new Product("Apple", 1.0);
        product2 = new Product("Banana", 2.0);
        product3 = new Product("Cherry", 3.0);
        shop = new Shop();
        shop.setProducts(Arrays.asList(product1, product2, product3));
    }

    @Test
    public void testSortProductsByPrice() {
        List<Product> sortedProducts = shop.sortProductsByPrice();
        assertThat(sortedProducts).containsExactly(product1, product2, product3);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertThat(mostExpensiveProduct).isEqualTo(product3);
    }
}
