package com.screenshots;






import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Meenakshi {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.google.com");
		
		
	//	File src=ts.getScreenshotAs(OutputType.FILE);
		//FileUtil
	
		
	}

}
