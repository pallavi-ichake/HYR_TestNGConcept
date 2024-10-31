package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part18_DataProviderFromAnotherClass 
{
		
		
		@Test(dataProvider = "DataProviderTest",dataProviderClass = Part16_DataProviderMultiDimen.class)
		public void testDataProviderWithName(String username, String passowrd)
			{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			driver.findElement(By.id("email")).sendKeys(username);

			driver.findElement(By.id("pass")).sendKeys(passowrd);
			
			driver.quit();
			}
	}


