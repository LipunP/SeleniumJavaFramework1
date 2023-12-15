package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Yipee");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Just start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Just Finish");
		
	}
	
	
	
	
	
	
}