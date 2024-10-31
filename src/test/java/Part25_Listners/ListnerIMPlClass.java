package Part25_Listners;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)
public class ListnerIMPlClass 
{
	@Test
	public void FirstTestCases()
	{
		System.out.println("First of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test()
	public void SecondTestCases() throws InterruptedException
	{
		System.out.println("Second of Test Cases of TestNG "+Thread.currentThread().getId());
		Assert.assertTrue(false);
	}
	
	@Test(timeOut = 1000)
	public void ThirdTestCases() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Third of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	
	@Test()
	public void ForthTestCases()
	{
		System.out.println("Forth of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	
	@Test()
	public void FifthTestCases()
	{
		System.out.println("Fifth of Test Cases of TestNG "+Thread.currentThread().getId());
	}

}



