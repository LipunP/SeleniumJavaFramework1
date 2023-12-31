package listeners;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listeners.class)
public class ListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
		throw new SkipException("Test case was skipped");
	}
}
