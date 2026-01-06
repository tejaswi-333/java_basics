package testing.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Add a = new Add();
		int actual=a.add(2,3);
		int expectedResult=5;
		assertEquals(expectedResult, actual);
	}

}
