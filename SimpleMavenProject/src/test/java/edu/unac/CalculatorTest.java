package edu.unac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-10, calculator.multiply(-2, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(3, 5));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.division(6, 3));
        assertEquals(0, calculator.division(0, 5));
        assertThrows(ArithmeticException.class, () -> calculator.division(5, 0));
    }
}
