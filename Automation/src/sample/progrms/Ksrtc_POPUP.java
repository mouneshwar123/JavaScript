package sample.progrms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ksrtc_POPUP {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		opt.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.ksrtc.in/oprs-web/ticket/cancel.do");
		
		driver.findElement(By.id("sbkg")).click();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		
		alert.dismiss();
		
		Thread.sleep(2000);
		
		

	}
}
