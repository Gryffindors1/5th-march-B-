package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pyspeak.com/");
		
		Thread.sleep(7000);
		
		WebElement text1 = driver.findElement(By.xpath("(//a[text()='Creating Pandas DataFrame'])[1]"));
		 
		System.out.println(text1.getText());
		
		String actualtext = text1.getText();
		String expectedtext="";
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("text is matching and test is passed");
		}
		else 
		{
			System.out.println("test is not matching and test is failed");
		}
			
	
	}

}
