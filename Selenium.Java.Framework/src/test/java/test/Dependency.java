package test;

import org.testng.annotations.Test;

public class Dependency {

	@Test (dependsOnMethods = {"test2","test3"})
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test 
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test 
	public void test3()
	{
		System.out.println("Test3");
	}
	@Test(dependsOnGroups = "Sanity")
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test(groups = {"Sanity"})
	public void test5()
	{
		System.out.println("Test5");
	}
	@Test(groups = {"Sanity"})
	public void test6()
	{
		System.out.println("Test6");
	}
	@Test(groups = {"Sanity"})
	public void test7()
	{
		System.out.println("Test7");
	}
	@Test(groups = {"Regression"}) 
	public void test8()
	{
		System.out.println("Test8");
	}
	
}
