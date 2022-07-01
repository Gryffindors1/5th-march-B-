package actionClass_mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class All_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		//1>
		Actions c = new Actions(driver);					//select actions webdriver
		//2>
		WebElement ele = driver.findElement(By.xpath("(//a[@class='button button-orange'])[7]"));
		//3> to move courser
		c.moveToElement(ele).perform();
		//4> to click on selected element
		c.click(ele).perform();
		//5> to right click on selected element
		c.click(ele).contextClick().perform();
		Thread.sleep(2000);
		//6> to drag (click m hold and drop)
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement distination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		//7> i want scorll and see dropped 5000
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		System.out.println(driver.manage().window().getSize());
		j.executeScript("window.Scollby, (1385,744)");
		Thread.sleep(5000);
		
		//8> take direct method of drag n drop with (source,s]distination).perform
		c.dragAndDrop(source, distination);
		
		
		
		
		

	}

}
