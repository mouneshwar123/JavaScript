import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		
		Alert alert=dr.switchTo().alert();
		//Thread.sleep(5000);
		alert.accept();


	}

}
