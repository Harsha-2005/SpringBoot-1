import com.harsha.demo3.Java.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void testAddition(){
        int result = calculator.add(10,20);
        assertEquals(30,result);
    }

    @Test
    void testSubtraction(){
        int result = calculator.sub(10,20);
        assertEquals(-10,result);
    }

    @Test
    void testMultiplication(){
        int result = calculator.multiply(10,20);
        assertEquals(200,result);
    }

    @Test
    void testDivision(){
        int result = calculator.divide(10,20);
        assertEquals(5,result);

    }

    @Test
    void testisEven(){
        boolean result = calculator.isEven(10);
        assertEquals(true,result);
    }
}
