package demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import JunitTest.myTest1;


public class FirstTest {
	
	@Test
	public void sumTest() {
	myTest1 obj = new myTest1();
	int res = obj.sum(new int[] {1,2,3});
	
	System.out.println(res);
	assertEquals(5,res);
	System.out.println(res);
	
	}
	

}
