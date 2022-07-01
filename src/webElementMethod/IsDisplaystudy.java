package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplaystudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement displaybox = driver.findElement(By.id("displayed-text"));
		
		boolean result = displaybox.isDisplayed();
		System.out.println("text box field is "+result);
		displaybox.sendKeys("pune");
		Thread.sleep(1000);
		WebElement hidebox = driver.findElement(By.id("hide-textbox"));
		hidebox.click();
		
	}

}
