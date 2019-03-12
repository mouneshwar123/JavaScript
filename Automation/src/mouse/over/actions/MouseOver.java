package mouse.over.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseOver {
	
	public void Bhavani() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
	
	WebDriver dr=new FirefoxDriver();
	
	dr.get("https://www.spicejet.com/");
	
	
	}


}
