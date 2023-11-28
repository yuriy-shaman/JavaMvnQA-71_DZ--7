import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiseTest {


    @Test
    public void shouldFindMax() {
        MaxServise servise = new MaxServise();
        int a = 5;
        int b = 3;

        int expected = a;
        int actual = servise.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}