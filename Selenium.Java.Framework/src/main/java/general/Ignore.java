package general;

import org.testng.annotations.Test;

public class Ignore {

	@Test
	@org.testng.annotations.Ignore
	public void test1()
	{
		System.out.println("Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test 4");
	}
	
}
