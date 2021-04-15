package april14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
	
	@Test (priority = 1)
	public void demo() {
		
		System.out.println("Hello");
	}
	
	@Test (enabled = true)
	public void demo1() {
		System.out.println("456789");
		//Assert.assertTrue(false);
	}

	@Test
	public void demo2() {
		System.out.println("Hello 2");
	}
	
	@Test
	public void demo3() {
		System.out.println("Hello 3");
	}
	
}
