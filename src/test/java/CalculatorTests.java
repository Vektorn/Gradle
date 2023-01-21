import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private Calculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new Calculator();
    }

    @Test
    public void testSum1InputHandledCorrectly() {
        //When
        int actual = sumCalculator.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum3InputHandledCorrectly() {
        //When
        int actual = sumCalculator.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThat0InputHandledCorrectly() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()->sumCalculator.sum(0));
    }
}