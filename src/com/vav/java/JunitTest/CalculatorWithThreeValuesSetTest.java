import com.vav.java.Junit.Calculator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vaibhav on 3/4/2017.
 */
public class CalculatorWithThreeValuesSetTest {
    Calculator calculator;
    BigDecimal bigDecimal1;
    BigDecimal bigDecimal2;
    BigDecimal bigDecimal3;

    public CalculatorWithThreeValuesSetTest(){
          calculator = new Calculator();
         bigDecimal1 = new BigDecimal(12);
         bigDecimal2 = new BigDecimal(22);
         bigDecimal3 = new BigDecimal(32);
        calculator.setAccumulator(bigDecimal1);
        calculator.enter();
        calculator.setAccumulator(bigDecimal2);
        calculator.enter();
        calculator.setAccumulator(bigDecimal3);
     }
    @Test
    public void testEnteringAndDroppingValues(){

        assertEquals(bigDecimal3, calculator.getAccumulator());
        calculator.drop();
        assertEquals(bigDecimal2,calculator.getAccumulator());
        calculator.drop();
        assertEquals(bigDecimal1,calculator.getAccumulator());
    }
    @Test
    public void testCalculatorAfterEnteringThreeValues(){
        assertEquals(bigDecimal3,calculator.getAccumulator());
    }
    @Test
    public void testAccumulatorAfterOneDrop(){
        calculator.drop();
        assertEquals(bigDecimal2,calculator.getAccumulator());
    }
    @Test
    public void testAccumulatorAfterTwoDrops(){
        calculator.drop();
        calculator.drop();
        assertEquals(bigDecimal1,calculator.getAccumulator());
    }

}
