package junit_demo;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class ignoreTestjava {
	DivisionTest123 d1 = new DivisionTest123(10,2);
	DivisionTest123 d2 = new DivisionTest123(10,0);

	@Test
	@Ignore
	public void test() {
		assertEquals(5,d1.division());
	}
	
	@Test(expected=ArithmeticException.class)
	public void testException() {
		assertEquals(5,d2.division());
	}
}
