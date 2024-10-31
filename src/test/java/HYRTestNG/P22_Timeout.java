package HYRTestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class P22_Timeout {
	@Test(timeOut = (long) 0.032)
	public void OneTestCases()
	{
		System.out.println("First of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test(expectedExceptions= {NoSuchElementException.class})
	public void SecondTestCases() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Second of Test Cases of TestNG"+Thread.currentThread().getId());
	}
	
}