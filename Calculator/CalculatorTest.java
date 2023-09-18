package seminars.first.Calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {

    @Test
    public void testCalculateDiscountValid() {
        double result = Calculator.calculateDiscount(100.0, 10.0);
        assertThat(result).isEqualTo(90.0);
    }

    @Test
    public void testCalculateDiscountInvalidAmount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(-100.0, 10.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountInvalidDiscount() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(100.0, -10.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountInvalidDiscountOver100() {
        assertThatThrownBy(() -> Calculator.calculateDiscount(100.0, 110.0))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Invalid arguments");
    }
}
