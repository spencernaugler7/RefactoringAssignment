import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IfElseDemoTest {
    @Test
    public void low() {
        assertEquals(1825, insuranceFor(5000), 0.01);
    }

    @Test
    public void medium() {
        assertEquals(38600, insuranceFor(25000), 0.01);
    }

    @Test
    public void high() {
        assertEquals(78500, insuranceFor(50000), 0.01);
    }

    @Test
    public void veryHigh() {
        assertEquals(106400, insuranceFor(100_000), 0.01);
    }

    private double insuranceFor(double income) {
        InsuranceCalculator calc = new InsuranceCalculator(Arrays.asList(
                new InsuranceStrategyLow(),
                new InsuranceStrategyMedium(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyVeryHigh()
        ));
        return calc.calculateInsurance(income);
    }
}
