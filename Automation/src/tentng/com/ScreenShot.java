package tentng.com;

import java.io.File;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	
	@Test
	
	public void CaptureScreenShot()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		/*WebDriver driver=new ChromeDriver();
		//TakeScreenShot driver;
		TakeScreenShot ts=(TakeScreenShot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.c
		*/
		System.out.println(Math.max(120, 150));
	}

}
