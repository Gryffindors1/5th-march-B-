package assignment_utilityclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {

	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String random=RandomString.make(3);
	  File dest= new File("D:\\velocity 5thmarch b\\ss"+random+".png");
	  FileHandler.copy(src, dest);
	}
	
	public static void scroll(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public static void wait(WebDriver driver,int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(duration));
	}
	
	
	
}
