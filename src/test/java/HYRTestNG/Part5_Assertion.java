package HYRTestNG;

import org.testng.Assert;
import org.testng.Assert.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part5_Assertion
{
	@Test()
	public void testSetup()
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		boolean expectedTitle1 = "Facebook – log in or sign up" != null;
		
         assertEquals(actualTitle, expectedTitle1,"Title is mismatched");
         assertNotEquals(actualTitle, expectedTitle1,"Title not is mismatched");
        Assert.assertTrue(expectedTitle1,"It is True");
        Assert.assertFalse(expectedTitle1,"It is false");
        Assert.assertNull(expectedTitle1,"It is NULL true");
        Assert.assertNotNull(expectedTitle1,"It is NULL false");
		
		
		System.out.println(actualTitle);

		driver.findElement(By.id("email")).sendKeys("username");

		driver.findElement(By.id("pass")).sendKeys("passowrd");
		
		driver.quit();
		}
	

}
