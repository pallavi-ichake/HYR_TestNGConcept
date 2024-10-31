package HYRTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part8_Parameter {



	@Parameters("username")
	@Test()
	public void setup(String username) 
	{
		//WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys("admin");

	}
	@Parameters("Password")
	@Test()
	public void setup1(@Optional("chrome") String Password) 
	{
		//WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("Pallavi");

		driver.findElement(By.id("pass")).sendKeys(Password);

	}
	

}
