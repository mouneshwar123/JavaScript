package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bh {

	@Test
	public void Mouna()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\Desktop\\FileUpload.htm");
		driver.findElement(By.xpath("//input")).click();
		try {
			Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoIt\\Mouna.exe");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		
		}		
		
	}
}
