package junit_demo;

import org.junit.*;

public class DivisionTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("I am in before class Method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("I am in after class Method");
	}
	
	@Before
	public void before() {
		System.out.println("I am in before Method");
	}
	
	@After
	public void after() {
		System.out.println("I am in after Method");
	}
	@Test
	public void testcase1() {
		System.out.println("I am in test case1");
	}
	@Test
	public void testcase2() {
		System.out.println("I am in test case2");
	}
	@Ignore
	@Test
	public void testcase3() {
		System.out.println("I am in test case3");
	}
}
