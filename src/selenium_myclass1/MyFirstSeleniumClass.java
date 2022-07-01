package selenium_myclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumClass {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//driver.close();
		//driver.quit();
		
		//driver.navigate().to("https://www.flipkart.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.quit();
		driver.get("https://vctcpune.com/");
		Thread.sleep(100);
		String Title = driver.getTitle();        //to get title showing in console
		System.out.println("Title is "+Title);
		 
		driver.get("https://www.youtube.com/");
		Thread.sleep(400);
		String url =driver.getCurrentUrl();   //for showing current url in console
		System.out.println("current url is "+url);
		
		
		

		
		
	}
	

}
