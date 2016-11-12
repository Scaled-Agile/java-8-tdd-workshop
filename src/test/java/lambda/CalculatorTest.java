package lambda;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertThat("10 + 20", Calculator.addition(10, 20), equalTo(30));
    }

    @Test
    public void testSubtraction() {
        assertThat("100 - 50", Calculator.subtraction(100, 50), equalTo(50));
    }

    // TODO: Build your test for square sum z = x^2 + y^2
    @Test
    public void testSquareSum() {
        fail("To be implemented");
    }
}
