package iFramestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		
		//switch selenium focus from main page to frame
		
				driver.switchTo().frame("iframeResult");
				Thread.sleep(100);
				//current focus is on frame now
				driver.findElement(By.xpath("//button[@type='button']")).click();// this element is present on iframe(need to switch selenium focus from main page to frame)
				// to take action on main page again, we need to switch selenium  focus from frame to main page
				//parentframe();default content ();
				driver.switchTo().defaultContent();// switching selenium focus to main page
				driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
			

	}

}
