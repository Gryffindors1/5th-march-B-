package dropdownstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium installation files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();   		//Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		Thread.sleep(1000);
		driver.findElement(By.name("//input[@name='firstname']")).sendKeys("akshay"); 				 //Sendkeys():  This method is use to enter value in the input/text field
		Thread.sleep(100);
		driver.findElement(By.name("//input[@name='lastname']")).sendKeys("kamble");				//Sendkeys():  This method is use to enter value in the input/text field
		Thread.sleep(100);
		driver.findElement(By.name("//input[@name='reg_email__']")).sendKeys("8605299664");			//Sendkeys():  This method is use to enter value in the input/text field
		Thread.sleep(100);
		driver.findElement(By.name("//input[@name='reg_passwd__']")).sendKeys("12345asd");			//Sendkeys():  This method is use to enter value in the input/text field
		Thread.sleep(100);
		//1.	Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.name("//select[@name='birthday_day']"));
			
		//2.	Create an object of Select class which will accept WebElement as argument
			Select s= new Select(day);
		
		//3 By using one of the select class methods we can select values form list box like 
		//1. selectByVisibleText: selectByVisibleText(String arg0) 
		//2. selectByIndex: selectByIndex(int arg0) 
		//3. selectByValue: selectByValue(String arg0)*/
			Thread.sleep(100);
			s.selectByValue("16");
			
			WebElement month = driver.findElement(By.name("//select[@name='birthday_month']"));
			Select s1= new Select(month);
			s1.selectByIndex(8);
			Thread.sleep(100);
			WebElement year = driver.findElement(By.name("//select[@name='birthday_year']"));
			new Select(year);
			s1.selectByIndex(0);
	}
		

}
