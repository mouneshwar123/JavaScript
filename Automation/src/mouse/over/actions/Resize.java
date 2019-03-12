package mouse.over.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		opt.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://jqueryui.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("resizable")).click();
		
		//act.clickAndHold().build().perform();
		
		Thread.sleep(2000);
		
		act.moveByOffset(428, 128).build().perform();;
		
		
		//act.dragAndDropBy(src, 398, 2).build().perform();
		
		//act.dragAndDrop(src, trg).build().perform();
		
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
