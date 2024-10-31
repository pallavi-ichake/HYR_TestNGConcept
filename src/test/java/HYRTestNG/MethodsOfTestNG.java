package HYRTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MethodsOfTestNG 
{
	//ignore have high priority than enbaled = false
	@Ignore
	@Test(enabled = true)
	public void FirstTestCases()
	{
		System.out.println("First of Test Cases of TestNG");
	}
	
	//Just iganore method
	@Ignore
	@Test()
	public void SecondTestCases()
	{
		System.out.println("Second of Test Cases of TestNG");
	}
	
	@Test(groups={"Sanity"})
	public void SecondTestCases2()
	{
		System.out.println("Another Second of Test Cases of TestNG");
	}
	
	//Depends on methods
	@Test(priority = 1, dependsOnMethods = {"SecondTestCases2"},groups={"Sanity","Regression"})
	public void ThirdTestCases()
	{
		System.out.println("Third of Test Cases of TestNG");
	}
	
	//Grouping
	@Test(groups={"Regression"})
	public void ForthTestCases()
	{
		System.out.println("Forth of Test Cases of TestNG");
	}
	
	@Test(groups={"smoke","Regression"})
	public void FifthTestCases()
	{
		System.out.println("Fifth of Test Cases of TestNG");
	}

}
