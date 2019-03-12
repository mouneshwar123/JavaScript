package tentng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMI9Jrcl4aa4AIVVxOPCh3BNgSbEAAYASAAEgKfe_D_BwE_k_&gclid=EAIaIQobChMI9Jrcl4aa4AIVVxOPCh3BNgSbEAAYASAAEgKfe_D_BwE");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div/ol/li[4]/div/div/div/div/span/a/img"))));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div/ol/li[4]/div/div/div/div/span/a/img")).click();
	}

}
