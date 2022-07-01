package scrollingsizeset;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(2000);
		
		//To set Position--> Use Point Class And Create Object of Point Class
		
		Point p = new Point(800, 500);
		driver.manage().window().setPosition(p);
		
		
	}

}
