import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calci {
	
	@Test
	public void Sample()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://calc.qedgetech.com/");
	
		dr.findElement(By.xpath("//input[@id='btn' and @value='2']")).click();
		
		dr.findElement(By.xpath("//input[@id='btn' and @value='+']")).click();
		
		dr.findElement(By.xpath("//input[@id='btn' and @value='8']")).click();
		
		dr.findElement(By.xpath("//input[@id='btn' and @value='=']")).click();
		 
		String s=dr.findElement(By.name("display")).getAttribute("value");
		
		System.out.println("The result is="+s);
		String s1=dr.getWindowHandle();
		System.out.println(s1);
		
		dr.close();
	}
}
