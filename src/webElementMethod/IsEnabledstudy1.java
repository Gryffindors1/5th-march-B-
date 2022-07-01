package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledstudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.discoveryplus.in/?gclid=Cj0KCQjwyMiTBhDKARIsAAJ-9Vt10at2nNhVCKUY5y9_Noe8ts0W0hK3IEQegVrdXSOaTWDfP7HdTbsaAsJJEALw_wcB");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(5000);
		
		WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = OTPbutton.isEnabled();
		System.out.println("otp button is "+result);
		
	
	
	}

}
