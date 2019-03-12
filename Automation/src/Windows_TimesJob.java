import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows_TimesJob {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");

		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.timesjobs.com/candidate/job-search.html?searchType=Quick&from=submit&asKey=OFF&cboWorkExp1=1&txtLocation=Hyderabad/%20Secunderabad&siteparams=3p9901&utm_source=google&utm_medium=cpc&utm_campaign=search&outSource=versionA_B&gclid=Cj0KCQiA14TjBRD_ARIsAOCmO9Z3clpbvCRhtSn-bjBVWVUQhpJRT95Baq2IzUB1oo5lmJ2TqoDVDJMaAnBqEALw_wcB&show=true");
		
		dr.findElement(By.id("notify-visitors-confirm-popup-btn-positive")).click();
		
		Thread.sleep(3000);
		
		dr.close();

	}

}
