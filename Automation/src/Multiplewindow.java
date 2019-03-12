import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.irctc.co.in/nget/train-search");
		dr.findElement(By.linkText("FLIGHTS")).click();
		// TODO Auto-generated method stub
		Set<String>allwindows=dr.getWindowHandles();
		for(String x:allwindows)
		{
			System.out.println(x);
		}
		Object[] window=allwindows.toArray();
		String window1=window[0].toString();
		String window2=window[1].toString();
		dr.switchTo().window(window2);
		String title=dr.getTitle();
		System.out.println(title);
		
		

	}

}
