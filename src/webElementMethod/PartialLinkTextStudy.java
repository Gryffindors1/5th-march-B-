package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialLinkTextStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sggs.ac.in/");
		Thread.sleep(1000);
		
		WebElement partial = driver.findElement(By.partialLinkText("Rules and"));
		
		partial.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()=' View Details'])[1]")).click();
		Thread.sleep(9000);
		driver.close();
	}

}
