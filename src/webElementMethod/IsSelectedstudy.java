package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedstudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
		boolean result = checkbox.isSelected();
		System.out.println("result is "+result);
		
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is already selected");
		}
		else
		{
			System.out.println("select checkbox now");
			checkbox.click();
			
		}
		
	
	      
	      

	}

}
