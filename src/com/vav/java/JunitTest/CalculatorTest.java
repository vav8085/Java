import com.vav.java.Junit.Calculator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vaibhav on 3/3/17.
 */
public class CalculatorTest {
    @Test
    public void testNewCalculatorHasAnAccumulatorofZero(){
        Calculator calc = new Calculator();
        assertEquals(BigDecimal.ZERO,calc.getAccumulator());
    }
    @Test
    public void testSettingAccumulatorValue(){
        Calculator calculator = new Calculator();
        BigDecimal bigDecimal = new BigDecimal(23);
        calculator.setAccumulator(bigDecimal);
        assertEquals(bigDecimal,calculator.getAccumulator());
    }
}
