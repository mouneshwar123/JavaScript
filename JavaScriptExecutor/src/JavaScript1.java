 import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Auto\\dr\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		//dr.get("http://demo.automationtesting.in/");
		
		
		
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.location='http://demo.automationtesting.in/'");
		
		
		//printing visible text
		String str=js.executeScript("return document.getElementById('btn2').innerHTML\r\n" + 
				"").toString();
		
		System.out.println(str);
		
		//retrieving title
		String str1=js.executeScript("return document.title").toString();
		System.out.println(str1);
		js.executeScript("document.getElementById('email').value=\"mouneshwar.mallikarjun@gmail.com\"");
		js.executeScript("document.getElementById('enterimg').click()");
		
		js.executeScript("document.querySelector(\"input[placeholder='First Name']\")"
				+ ".value='Bhavani';\r\n" + 
				"");
		Thread.sleep(2000);
		
		//Refreshing page
		js.executeScript("window.history.go(0)");
		
		//Scrolling down from start page
		//js.executeScript("window.scrollBy(0,500)");
		
		//Scroll till end of page
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll to particular element
		js.executeScript("document.querySelector(\"input[type='tel']\").scrollIntoView()");
		
		//back
		js.executeScript("window.history.back()");
		
		Thread.sleep(4000);
		
		//forward
		js.executeScript("window.history.forward()");
		//js.executeScript("alert('Suntiara')");
		String st=js.executeScript("return document.domain").toString();
		System.out.println(st);
		
		js.executeScript("window.open('https://www.google.com')");
	}

}
