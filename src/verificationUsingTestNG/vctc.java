package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class vctc {
  @Test
  public void myTc() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		//Title of webpage is match or not
//		WebElement Text = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
//		//System.out.println("Title is "+Text);
//		String expectedTitle = "VELOCITY CORPORATE TRAINING CENTER";
//		String actualTitle  = Text.getText();
//		
//		Assert.assertEquals(actualTitle, expectedTitle, "Titles of the website do not match");
//		Reporter.log("Title of Website is match", true);
		
		//Radio Button is select or not
//		WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));  
//		RadioButton.click();
//		
//		Assert.assertTrue(RadioButton.isSelected(),"Radio Button is not Selected TC is failed" );  //
//		Reporter.log("Radio Button is Selected TC is Passed", true);
		
		
		//element Displayed or not
		
		//WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		//hideButton.click();
		
		//Assert.assertFalse(hideButton.isDisplayed(), "HideButton is not Displayed Tc is failed");
		//Reporter.log("HideButton is Displayed Tc is Passed", false);
		
		WebElement text = driver.findElement(By.id("displayed-text"));
		text.sendKeys("akshay");
		
		Assert.assertNotNull(text, "value is notnull TC failed");
		Reporter.log("value is NOT null TC is passed", true);
		
  }
}
