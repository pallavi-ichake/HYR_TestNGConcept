package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_SingaleDimenInteg {
	
	@DataProvider()
	public Integer[] DataProviderTest()
	{
		Integer[] fbData = new Integer[] 
	    {
	    		1,
	    		2,
	    		3
	    };
		return fbData;
	}

	@Test(dataProvider = "DataProviderTest")
	public void testDataProviderWithName(Integer username) {
		System.out.println(username);
	}
}
