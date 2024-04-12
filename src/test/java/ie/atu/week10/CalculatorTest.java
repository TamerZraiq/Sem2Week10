package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator newCalc;
    @Test
    void addTest(){
        newCalc = new Calculator();
        assertEquals(10, newCalc.add(4,6));
    }
    @Test
    void subtractTest(){
        newCalc = new Calculator();
        assertEquals(-2, newCalc.subtract(4,6));
    }
    @Test
    void multiplyTest(){
        newCalc = new Calculator();
        assertEquals(24, newCalc.multiply(4,6));
    }
}
