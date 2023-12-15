package priority;

import org.testng.annotations.Test;

public class PriotityTestNG {
	
	@Test 
	public void Apple()
	{
		System.out.println("Test 1");
	}
	@Test (priority = -1)
	public void Cat()
	{
		System.out.println("Test 2");
	}
	@Test (priority = 5)
	public void Ball()
	{
		System.out.println("Test 3");
	}
	
}
