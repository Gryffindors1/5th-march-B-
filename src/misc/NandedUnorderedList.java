package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NandedUnorderedList {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.name("q")).sendKeys("nanded");
		
		List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement search: searchresults)
		{
			System.out.println(search.getText());
		}
		
		String exectedResult = "nanded to pune";
		
		for(WebElement results:searchresults) {
			results.getText();
			if(results.equals(exectedResult)) {
				results.click();
				break;
			}
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
		driver.findElement(By.partialLinkText("Map")).click();
	}
	

}
