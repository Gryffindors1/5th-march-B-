package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains_txt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium installation files\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.sginstitute.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[contains(text(),'National Institutional Ranking Framework (NIRF)')]")).click();
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[contains(text(),' 	Overall Full Report for-National Institutional Ranking Framework 2019 - MHRD ')]")).click();
		
	
		driver.close();
		
	}

}
