package DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_IteratorList {
	
	
	@DataProvider()
	public Iterator<String> DataProviderTest()
	{
		List <String> fbData = new ArrayList<>();
	    {
	    	fbData.add("Pallavi");
	    	fbData.add("Pal");
	    };
		return fbData.iterator();
	}

	@Test(dataProvider = "DataProviderTest")
	public void testDataProviderWithName(String username) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);
		//driver.findElement(By.id("pass")).sendKeys(password);

		driver.quit();
	}
}
