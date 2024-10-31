package HYRTestNG;
import org.testng.annotations.Test;

public class Part12_IgnoreTest 
{
	@Test(priority=1)
	public void OneTestCases()
	{
		System.out.println("First of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test(priority=1)
	public void SecondTestCases() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Second of Test Cases of TestNG"+Thread.currentThread().getId());
	}
	
	@Test()
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





