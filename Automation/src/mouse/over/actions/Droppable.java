package mouse.over.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		opt.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		//WebElement trg=driver.findElement(By.id("droppable"));
		
		act.dragAndDropBy(src, 398, 2).build().perform();
		
		//act.dragAndDrop(src, trg).build().perform();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("scrollTo(0,400)");
		
		Thread.sleep(5000);
		
		driver.close();


	}

}
