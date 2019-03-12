package com.calender.handle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.className("firstLevelMenu")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[5]/a/b")).click();
		driver.findElement(By.xpath("//*[@id=\"candidateSearch_fromDate\"]")).click();
		Select ch=new Select(driver.findElement(By.className("ui-datepicker-month")));
		ch.selectByVisibleText("Feb");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[3]/td[1]/a")).click();
		
	}

}
