package DataProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_IteratorArray {
	
	
	@DataProvider()
	public Iterator<Object[]> DataProviderTest()
	{
		Set <Object[]> fbData = new HashSet<>();
	    {
	    	fbData.add(new Object[] {"pal",123});
	    	fbData.add(new Object[] {"pal",123});
	    };
		return fbData.iterator();
	}

	@Test(dataProvider = "DataProviderTest")
	public void testDataProviderWithName(Object[] username) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("pass")).sendKeys(password);

		driver.quit();
	}
}
