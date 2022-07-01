package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=kC2l-DODse8&list=RDkC2l-DODse8&start_radio=1");
		
		driver.manage().window().maximize();
		//1.	xpath by attribute
		//Syntax :
		   //tagname[@attribute name = ‘attribute value’]
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@button='play']")).click();
		
		
		
		
		
	}

}
