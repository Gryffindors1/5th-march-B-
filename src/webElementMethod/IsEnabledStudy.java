package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/myaccount/subscription?utm_source=GoogleSearch&utm_medium=Mark_CPA&utm_campaign=Essence-ZEE5-Brand-Phrase-Performance&utm_term=zee5%20login&utm_content=Brand-Phrase&gclid=Cj0KCQjwyMiTBhDKARIsAAJ-9VvVV5LZ_1u2pdoyPStFv4ROvAygq1H8LovIUnmNgHQAHPGUcs0w-PYaAha0EALw_wcB&gclsrc=aw.ds");
		Thread.sleep(3000);
		
		   driver.findElement(By.xpath("//a[text()='Login']")).click();
		   Thread.sleep(4000);
		   
		   WebElement ele = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
		   boolean result = ele.isEnabled();
		   System.out.println("login button status is "+result);
		   
		   
		   driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("8899774455");
		   Thread.sleep(2000);
		   boolean result1 = ele.isEnabled();
		   System.out.println("login button status is "+result1);
		   
		
	}
	

}
