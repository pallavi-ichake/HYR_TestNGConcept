package HYRTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Part26_ScreenshotForFailed 
{
	static WebDriver driver;
	String filepath = "C:\\Users\\apall\\OneDrive\\Documents\\WorkSpaces\\Pallavi\\TestNGConcept\\Screenshots";
	public static void captureScreenshot(String fileName) throws IOException 
	{
		//File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(File, new File(filepath + fileName + ".jpeg"));
		
		/*TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(filepath + fileName);
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("Screenshot save");*/
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\apall\\OneDrive\\Documents\\WorkSpaces\\Pallavi\\TestNGConcept\\Screenshots.png");
			FileUtils.copyFile(src, trg);
		System.out.println("Screenshot save");
	}
		
		
		
		
	}

