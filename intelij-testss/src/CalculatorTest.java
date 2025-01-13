import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void shouldCalculateAverageOfPositiveNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = 3.0;
        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void shouldReturnZeroAverageForEmptyArray() {
        int[] numbers = {};

        double actualAverage = Calculator.average(numbers);

        double expectedAverage = 0;
        assertEquals(expectedAverage, actualAverage);
    }
}
