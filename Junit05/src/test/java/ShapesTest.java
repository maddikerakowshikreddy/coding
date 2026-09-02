import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class ShapesTest {
	@BeforeAll
	static void start()
	{
		System.out.println("Testing Started");
	}
	
	
	@AfterAll
	static void end()
	{
		System.out.println("Ended tesing");
	}
	Shapes s;
	@BeforeEach
	void repaet(TestInfo info)
	{   
		System.out.println("Method name: " + info.getTestMethod().get().getName()+"invoked");
		s=new Shapes();
		System.out.println("instance create before test");
	}
	
	@AfterEach
	void last() {
		System.out.println("Actual test is complted");
	}
	@Test
	@DisplayName("default test")
//	@Disabled
	void test() {
		assertEquals(10,10);
		
	}
	
	
	@Test
	@DisplayName("square area")
	void testcompute()
	{
		
		assertEquals(4,s.computeSquareArea(2));
	}
	
	@Test
	@DisplayName("square area with message")
	void testcomputeMessage() {

	    System.out.println("INSIDE testcomputeMessage");

	    assertEquals(4, s.computeSquareArea(2), "failed");
	}
	
	
	@Test
	@DisplayName("circle area")
	void testcomputecirlceMessage()
	{
		
		assertNotEquals(12.57,s.computeCircleArea(2.0),"failed");
	}
	
	
	@Test
	@DisplayName("palinde check")
	void testassertrue()
	{
		Palindrome p=new Palindrome();
		assertTrue(p.isPalindrome("mom"));
	}
	
	
	
	
	@RepeatedTest(3)
	@DisplayName("array check")
	void testArray()
	{
		int e[]= {1,2,3,4,5};
		int a[]= {1,2,3,4,5};
		
		assertArrayEquals(a,e);
	}

}
