import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();

        assertEquals("FizzBuzz", fb.fizzBuzz(15));
        assertEquals("Fizz", fb.fizzBuzz(9));
        assertEquals("Buzz", fb.fizzBuzz(10));
        assertEquals("7", fb.fizzBuzz(7));
    }
}
