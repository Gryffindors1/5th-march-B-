package scrollingsizeset;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//to set size-->> use dimension class and create object of dimension class
		
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(3000, 1080);
		driver.manage().window().setSize((org.openqa.selenium.Dimension) d);
		
		
		
		
		
		
		
		
		
		
	}

}
