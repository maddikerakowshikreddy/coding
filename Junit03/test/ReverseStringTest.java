import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rev=new ReverseString();
		assertEquals("avaj",rev.reverseString("java"));
		assertEquals("kihswok",rev.reverseString("kowshik"));
	}
	
	@Test
	void testsentence() {
		ReverseString rev=new ReverseString();
		assertEquals("ysae si avaj",rev.reverseString("java is easy"));
		assertEquals("ydder kihswok",rev.reverseString("kowshik reddy"));
	}

}
