import static org.junit.Assert.*;

import org.junit.Test;


public class UnitTest {
	
	int a1[]={7,9,3,4};
	int a2[]= {8,5,6,4};
	int t1[]= {2,3,1};
	int t2[]= {2,1,2};
	int e1=2,e2=2;
	int x1=3;
	int x2=3;
	int n=4;

	Fastest_Way fw = new Fastest_Way();

	@Test
	public void test() {
		assertEquals(26,fw.fastest_way(a1,a2,t1,t2,e1, e2,x1,x2,n)); 
		assertNotNull(fw.fastest_way(a1,a2,t1,t2,e1, e2,x1,x2,n));
	}
}
