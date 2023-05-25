package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @BeforeEach
    void setup() {
        Calculator calculator = new Calculator();
    }
    /**
     * Test of add method, of class Calculator.
     * Here we test the add method of the Calculator class with 3 different test cases.
     * The first test case is a simple addition of 2 positive numbers.
     * The second test case is a simple addition of 2 positive numbers, one of them is a double.
     * The third test case is a simple addition of 2 negative numbers.
     */
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(8.0, calculator.add(5, 3));
    }
    @Test
    void testAdd2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(24.55, calculator.add(21.55, 3));
    }
    @Test
    void testAdd3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-8, calculator.add(-5, -3));
    }

    /**
     * Test of minus method, of class Calculator.
     * Here we test the minus method of the Calculator class with 3 different test cases.
     * The first test case is a simple subtraction of 2 positive numbers.
     * The second test case is a simple subtraction of 2 positive numbers, the result is 0.
     * The third test case is a simple subtraction of 2 a negative and a positive number.
     */
    @Test
    void testMinus() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2.0, calculator.minus(5, 3));
    }
    @Test
    void testMinus2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.minus(5, 5));
    }
    @Test
    void testMinus3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-8, calculator.minus(-5, 3));
    }

    /**
     * Test of multiply method, of class Calculator.
     * Here we test the multiply method of the Calculator class with 3 different test cases.
     * The first test case is a simple multiplication of 2 positive numbers.
     * The second test case is a simple multiplication of 2 positive numbers, one of them is 0.
     * The third test case is a simple multiplication of 2 a negative and a positive number.
     */
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(15.0, calculator.multiply(5, 3));
    }
    @Test
    void testMultiply2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.multiply(5, 0));
    }
    @Test
    void testMultiply3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-15.54, calculator.multiply(5.18, -3));
    }

    /**
     * Test of divide method, of class Calculator.
     * Here we test the divide method of the Calculator class with 3 different test cases.
     * The first test case is a simple division of 2 positive numbers.
     * The second test case is a simple division of 2 positive numbers, one of them is 0.
     * The third test case is a simple division of 2 a negative and a positive number.
     */
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(1.667, calculator.divide(5, 3), 0.001);
    }
    @Test
    void testDivide2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(0, calculator.divide(0, 3));
    }
    @Test
    void testDivide3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-1.667, calculator.divide(5, -3), 0.001);
    }
}
