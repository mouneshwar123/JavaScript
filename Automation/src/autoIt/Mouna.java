package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mouna {
	@Test
	public void Sample() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("http://tinyupload.com/");
		
		//Thread.sleep(3000);
		
		WebElement ele=dr.findElement(By.className("pole_plik"));
		
		ele.click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\MMB.exe");
		
		dr.close();
	}

}
