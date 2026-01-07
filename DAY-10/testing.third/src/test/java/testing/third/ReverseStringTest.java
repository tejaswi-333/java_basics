package testing.third;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseNormalString() {
        ReverseString rs = new ReverseString();
        assertEquals("olleH", rs.rev("Hello"));
    }
}
