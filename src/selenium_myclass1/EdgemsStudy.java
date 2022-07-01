package selenium_myclass1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class EdgemsStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","D:\\selenium installation files\\Edge_win64\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		Alert alt = driver.switchTo().alert();
		//2.Alert is an interface which contains abstract methods like
		System.out.println(alt.getText());//use to get text present in a alert popup.
		alt.accept();//use to click on ok button.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}

}
