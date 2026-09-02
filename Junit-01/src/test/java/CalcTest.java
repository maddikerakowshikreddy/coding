import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalcTest {

	@Test
	void test() {
		int n1=1;
		int n2=2;
		Calc c=new Calc();
		int n=c.divide(n1,n2);
		assertEquals(n,0);
	}

}
