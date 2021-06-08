import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void testPlus() {
        int value1 = 1;
        int value2 = 1;
        int expected = 2;
        int actual = value1 + value2;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testIsPositive() {
        int value1 = 5;
        Boolean actual = value1 > 0;
        Assertions.assertTrue(actual);
    }
    @Test
    public void testMultiply() {
        int value1 = 3;
        int value2 = 2;
        int expected = 6;
        int actual = value1 * value2;
        Assertions.assertEquals(expected,actual);
    }

}