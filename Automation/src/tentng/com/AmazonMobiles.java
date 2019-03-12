package tentng.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonMobiles {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.flipkart.com/?affid=rajeevsin10&affExtParam1=raj&affExtParam2=jan2019");
		dr.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebDriverWait wait=new WebDriverWait(dr, 50);
		wait.until(ExpectedConditions.elementToBeSelected(dr.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[4]/div/a/div/img[2]"))));
		dr.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[4]/div/a/div/img[2]")).click();
		

	}

}
