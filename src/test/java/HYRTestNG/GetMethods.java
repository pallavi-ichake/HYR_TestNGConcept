package HYRTestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()
*/

public class GetMethods {

	@Test
	public void getTitle()
	{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
		System.out.println("Current URL:"+ driver.getCurrentUrl());
	}
	
	@Test
	public void getCurrentURL()
	{
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("Current URL:"+ driver.getCurrentUrl());
	}
}