package april14;

import org.testng.annotations.Test;

public class DemoClass2 {
	
	@Test (groups = {"groups 1"})
	public void demo11() {
		
		System.out.println("Hello11");
	}
	@Test
	public void demo12() {
		
		System.out.println("Hello12");
	}
	
	@Test (groups = {"groups 2"})
	public void demo13() {
		
		System.out.println("Hello13");
	}
	
	@Test (groups = {"groups 2"})
	public void demo14() {
		
		System.out.println("Hello14");
	}
	
	@Test 
	public void demo15() {
		
		System.out.println("Hello15");
	}
	
}
