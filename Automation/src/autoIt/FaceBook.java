package autoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException, IOException {



		ChromeOptions maa=new ChromeOptions();

		maa.addArguments("--start-maximized");

		maa.addArguments("--disable-infobars");

		maa.addArguments("--disable-popup-blocking");

		maa.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");

		WebDriver driver =new ChromeDriver(maa);

		WebDriver dr=new ChromeDriver(maa);
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		dr.get("https://www.facebook.com/");

		dr.findElement(By.id("email")).sendKeys("mouneshwar.mallikarjun@gmail.com");

		dr.findElement(By.id("pass")).sendKeys("mouneshwar123");



		dr.findElement(By.id("loginbutton")).click();

		Thread.sleep(4000);

		dr.findElement(By.id("pageLoginAnchor")).click();

		dr.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();

	}

}
