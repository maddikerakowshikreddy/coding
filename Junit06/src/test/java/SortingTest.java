import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingTest {

	@Test
	void test() {
		
		int[] arr= null;
		Sorting s=new Sorting();
		try
		{
			
			int[] a=s.sorts(arr);
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	@Test
	void testthrows() {
		
		int[] arr= null;
		Sorting s=new Sorting();
		assertThrows(Exception.class,()->s.sorts(arr));
	}

}
