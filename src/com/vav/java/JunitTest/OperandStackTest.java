import com.vav.java.Junit.OperandStack;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


/**
 * Created by Vaibhav on 3/4/2017.
 */
public class OperandStackTest {
    OperandStack stack  = new OperandStack();

    @Test
    public void testNewOperandStackPeekReturnsZero(){
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
    @Test
    public void testPushingNewValueOnTHeStack(){
        BigDecimal value = new BigDecimal(BigInteger.valueOf(34));
        stack.push(value);
        assertEquals(value, stack.peek());
    }
    @Test
    public void testReplacingValueAtTopOfStack(){
        stack.push(new BigDecimal(22));
        BigDecimal bigDecimal = new BigDecimal(BigInteger.valueOf(66));
        stack.ReplaceTop(bigDecimal);
        assertEquals(bigDecimal, stack.peek());
    }
    @Test
    public void testReplacingValueOnTopOfEmptyStack(){
        BigDecimal bigDecimal = new BigDecimal(BigInteger.valueOf(66));
        stack.ReplaceTop(bigDecimal);
        assertEquals(bigDecimal, stack.peek());    }
    @Test
    public void testPoppingValueFromStack(){
        BigDecimal value = new BigDecimal(BigInteger.valueOf(24));
        stack.push(value);
        stack.push(new BigDecimal(BigInteger.valueOf(34)));
        stack.pop();
        assertEquals(value,stack.peek());
    }
    @Test
    public void testPoppingEmptyStack(){
        stack.pop();
        assertEquals(BigDecimal.ZERO,stack.peek());
    }
}
