package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Method_txt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//2. Xpath text type of Xpath syntax: //tagname[text()='vaule']
		
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		
		Thread.sleep(100);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		Thread.sleep(100);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		
				
						
						
	}

}
