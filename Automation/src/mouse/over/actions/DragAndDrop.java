package mouse.over.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--start-maximized");
		
		opt.addArguments("--disable-infobars");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		
		WebElement trg=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, trg).build().perform();
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
