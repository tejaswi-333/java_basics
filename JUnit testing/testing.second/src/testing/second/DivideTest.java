package testing.second;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;


public class DivideTest {

	@Test
	public void test() {
		Divide a = new Divide();
		int actual=a.div(6,3);
		int expectedResult=2;
		assertEquals(expectedResult, actual);
	}

}
