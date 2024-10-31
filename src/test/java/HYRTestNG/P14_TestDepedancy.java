package HYRTestNG;

import org.testng.annotations.Test;

public class P14_TestDepedancy {
	@Test(groups = {"smoke"})
	public void OneTestCases()
	{
		System.out.println("First of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test(enabled=false,groups = {"smoke","sanity"})
	public void SecondTestCases() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Second of Test Cases of TestNG"+Thread.currentThread().getId());
	}
	
	@Test(alwaysRun = true,dependsOnMethods= {"SecondTestCases"})
	public void ThirdTestCases()
	{
		System.out.println("Third of Test Cases of TestNG"+Thread.currentThread().getId());
	}
	
	@Test()
	public void ForthTestCases()
	{
		System.out.println("Forth of Test Cases of TestNG"+Thread.currentThread().getId());
	}
	
	@Test()
	public void FifthTestCases()
	{
		System.out.println("Fifth of Test Cases of TestNG"+Thread.currentThread().getId());
	}

}





