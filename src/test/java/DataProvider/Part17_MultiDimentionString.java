package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part17_MultiDimentionString {
	
	
	@DataProvider()
	public String[][] DataProviderTest()
	{
		String[][] fbData = new String[][] 
	    {
			{"1","Abhijeet"},
			{"2","Abhipal"},
			{"3","Deshmukha"}
	    };
		return fbData;
	}

	@Test(dataProvider = "DataProviderTest")
	public void testDataProviderWithName(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

		driver.quit();
	}
}
