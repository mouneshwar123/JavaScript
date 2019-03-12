package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MMB1_autoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		ChromeOptions maa=new ChromeOptions();
		
		maa.addArguments("--start-maximized");
		
		maa.addArguments("--disable-infobars");
		
		WebDriver dr=new ChromeDriver(maa);
		
		dr.navigate().to("http://tinyupload.com/");
		
		dr.findElement(By.name("uploaded_file")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\MMB.exe");
		
		//Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\Rakesh.exe");
		
		Thread.sleep(5000);
		
		//dr.close();
		

	}

}
