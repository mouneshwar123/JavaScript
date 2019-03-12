import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukari_windowID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		
		dr.get("https://www.naukri.com/");
		
		Set<String> allwindows=dr.getWindowHandles();
		
		for(String winds:allwindows)
		{
			
			System.out.println(winds);
		}
		
		Object[] window=allwindows.toArray();
		
		String window1=window[0].toString();
		
		String window2=window[1].toString();
		
		String win3=window[2].toString();
		
		dr.switchTo().window(window2);
		
		String title=dr.getTitle();
		
		System.out.println(title);
		
		dr.switchTo().window(window1);
		
		System.out.println(window1);
		
		dr.switchTo().window(win3);
		
		System.out.println(win3);
		
		
		
	}

}
