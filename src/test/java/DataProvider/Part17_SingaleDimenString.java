package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_SingaleDimenString {
	
	@DataProvider()
	public String[] DataProviderTest()
	{
		String[] fbData = new String[] 
	    {
	    		"Abhijeet",
	    		"Abhipal",
	    		"Deshmukha",
	    		"Ichake"
	    };
		return fbData;
	}

	@Test(dataProvider = "DataProviderTest")
	public void testDataProviderWithName(String username) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);

		driver.quit();
	}
}
