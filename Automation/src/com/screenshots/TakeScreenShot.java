package com.screenshots;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

//import javax.swing.plaf.FileChooserUI;

//import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.google.common.io.Files;

public class TakeScreenShot {
	
	@Test
	public void bhavani() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)dr;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShot/fb.png");
		
		//FileUtils.
	
		
		
		
		
	}

}
