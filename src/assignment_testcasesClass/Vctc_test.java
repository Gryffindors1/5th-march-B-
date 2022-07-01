package assignment_testcasesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vctc_test {
 // data members
	@FindBy(xpath= "//input[@value='Radio2']") private WebElement radiobutton2;
	@FindBy(xpath= "//td[text()='35']") private WebElement tabledata;
	@FindBy(id = "courses-iframe") private WebElement iframe;
	
	//constructor
	public  Vctc_test(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//method
	public WebElement radio2()
	{
		WebElement button = radiobutton2;
		return button;
		
	}
	
	public WebElement table()
	{
		WebElement data = radiobutton2;
		return data;
		
	}
	
	public WebElement iframe()
	{
		WebElement frame= radiobutton2;
		return frame;
		
	}
}
