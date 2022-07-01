package testScript_Zeroda;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage login = new KiteLoginPage(driver);
		
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		login.sendpin();
		login.clickoncontinuebutton();
		login.clickonusername();
		login.clickonlogoutbutton();
		
		
		
		
		
		
		
		
	}

}
