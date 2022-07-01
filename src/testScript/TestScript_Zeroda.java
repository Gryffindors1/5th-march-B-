package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript_Zeroda {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		submitbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.id("pin")).sendKeys("982278");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement userid1 = driver.findElement(By.xpath("//span[text()='ELR321']"));
		String actualtext = userid1.getText();
		String expectedtext="ELR321";
		
		if (actualtext.equals(expectedtext)) {
			
			System.out.println("Userid is matching and test case is pass");
		}
		else {
			System.out.println("Userid is not matching and test case is fail");
		}
		userid1.click();
		Thread.sleep(1000);
		WebElement logOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		logOutButton.click();
		Thread.sleep(1000);
		driver.close();
		
		}
		
		
	}


