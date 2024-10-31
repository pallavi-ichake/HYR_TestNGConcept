package Part22_ParallalTest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallalExcution3 
{
	@Test
	public void nineTestCases()
	{
		System.out.println("Nine of Test Cases of TestNG "+Thread.currentThread().getId());
	}
	

	@Test
	public void tenTestCases()
	{
		System.out.println("Ten of Test Cases of TestNG "+Thread.currentThread().getId());
	}
}



