import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		Palindrome p=new Palindrome();
		assertEquals(true,p.isPalindrome("mom"));
		assertEquals(false,p.isPalindrome("kowshik"));
	}
	
	 @Test
	    void test1() {

	        Secondlarge s = new Secondlarge();

	        int arr[] = {3, 4, 53, 2, 10};

	        assertEquals(10, s.secondLargest(arr));
	    }

}
