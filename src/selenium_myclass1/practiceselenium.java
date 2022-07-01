package selenium_myclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceselenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.indiabix.com/general-knowledge/general-science/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//in"));
	}

}
