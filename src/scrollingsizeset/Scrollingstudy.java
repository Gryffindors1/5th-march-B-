package scrollingsizeset;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingstudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));     //for time delay on webpage
		
		JavascriptExecutor j =((JavascriptExecutor)driver);
		//j.executeScript("window.scrollby(200,30)"); //for down
		Thread.sleep(100);
		j.executeScript("window.scrollby(40,-300)");  //for up
		Thread.sleep(100);
		j.executeScript("window.scrollby(400,60)");  //for right
		Thread.sleep(100);
		j.executeScript("window.scrollby(-300,60)");  //for down

		
	}

}
