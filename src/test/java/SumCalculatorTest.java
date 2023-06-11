import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void shouldSum1() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void shouldSum3() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void shouldNotSum0() {
       assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}