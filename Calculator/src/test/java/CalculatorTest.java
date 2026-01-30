import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for the Calculator class.
 * This class contains unit tests for all calculator operations using JUnit.
 * Each test method verifies the correctness of a specific calculator method.
 */
public class CalculatorTest {

    // Instance of Calculator to be tested - created once for all tests
    private Calculator calculator = new Calculator();

    /**
     * Tests the add method with various inputs including positive, negative, and zero values.
     * Verifies that addition works correctly in different scenarios.
     */
    @Test
    public void testAdd() {
        // Test basic addition: 2 + 3 = 5
        assertEquals(5, calculator.add(2, 3));

        // Test addition with negative numbers: -1 + 1 = 0
        assertEquals(0, calculator.add(-1, 1));

        // Test addition of two negative numbers: -2 + (-3) = -5
        assertEquals(-5, calculator.add(-2, -3));
    }

    /**
     * Tests the subtract method with various inputs.
     * Ensures subtraction works correctly with different number combinations.
     */
    @Test
    public void testSubtract() {
        // Test basic subtraction: 3 - 2 = 1
        assertEquals(1, calculator.subtract(3, 2));

        // Test subtraction resulting in negative: -1 - 1 = -2
        assertEquals(-2, calculator.subtract(-1, 1));

        // Test subtraction resulting in zero: 5 - 5 = 0
        assertEquals(0, calculator.subtract(5, 5));
    }

    /**
     * Tests the multiply method with various inputs including positive, negative, and zero.
     * Verifies multiplication handles different sign combinations correctly.
     */
    @Test
    public void testMultiply() {
        // Test basic multiplication: 2 * 3 = 6
        assertEquals(6, calculator.multiply(2, 3));

        // Test multiplication with negative result: 2 * (-3) = -6
        assertEquals(-6, calculator.multiply(2, -3));

        // Test multiplication with zero: 0 * 5 = 0
        assertEquals(0, calculator.multiply(0, 5));
    }
}