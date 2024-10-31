package HYRTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass extends Part26_ScreenshotForFailed implements ITestListener
{
	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			Part26_ScreenshotForFailed.captureScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish");
	}
}
