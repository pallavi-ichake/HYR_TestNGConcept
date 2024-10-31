package Part22_ParallalTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallalExcution2 
{
	@Test
	public void sixTestCases()
	{
		System.out.println("Sixth of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test
	public void sevenTestCases()
	{
		System.out.println("Seven of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	
	@Test()
	public void eightTestCases2()
	{
		System.out.println("eight of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	
}