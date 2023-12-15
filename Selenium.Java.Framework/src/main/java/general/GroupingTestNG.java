package general;

import org.testng.annotations.Test;

public class GroupingTestNG {

	@Test(groups = {"Windows.Sanity"})
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test(groups = {"Sanity", "Smoke"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups = {"Smoke", "Regression"})
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
