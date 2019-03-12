package javascript;

import java.util.Optional;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MMB2 {
	@Test
	public void myclass() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		WebDriverInfo info=new WebDriverInfo() {
			
			@Override
			public boolean isSupporting(Capabilities arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAvailable() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getMaximumSimultaneousSessions() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getDisplayName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Capabilities getCanonicalCapabilities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Optional<WebDriver> createDriver(Capabilities arg0) throws SessionNotCreatedException {
				// TODO Auto-generated method stub
				return null;
			}
		};

		WebDriver dr=new FirefoxDriver(); 

		dr.get("https://demo.vtiger.com/vtigercrm/");
		
		/*JavascriptExecutor js=(JavascriptExecutor)dr;
		
		js.executeScript("console.log('Welcome to Suntiara')").toString();
		*/
		//dr.close();

		//Thread.sleep(3000);
	}
}
