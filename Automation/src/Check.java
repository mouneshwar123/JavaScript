import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[text()='Simple Alert']")).click();

	}

}
