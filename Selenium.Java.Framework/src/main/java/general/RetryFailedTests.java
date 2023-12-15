package general;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTests {

	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test(retryAnalyzer = general.MyRetry.class)
	public void test2()
	{
		System.out.println("Test 2");
		int i=1/0;
	}
	@Test(retryAnalyzer = general.MyRetry.class)
	public void test3()
	{
		System.out.println("Test 3");
	}
	@Test(retryAnalyzer = general.MyRetry.class)
	public void test4()
	{
		System.out.println("Test 4");
		Assert.assertFalse(true);
	}	
	@Test
	public void test5()
	{
		System.out.println("Test 5");
	}
	
}
