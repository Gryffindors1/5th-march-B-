package testScript_Zeroda;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

																					//1. data members/variables
	@FindBy(id = "userid") private WebElement UN;
	@FindBy(id = "password") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	@FindBy(id= "pin") private WebElement pinOTP;
	@FindBy(xpath= "//button[@type='submit']") private WebElement continuebutton;
	@FindBy(xpath ="//span[text()='ELR321']") private WebElement username;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
																					//2. constructor
	public  KiteLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
																					//3.method
	public void sendUserName()			
	{
	UN.sendKeys("ELR321");
	}
	public void sendPassword()
	{
	PWD.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
	loginButton.click();
	}
	public void sendpin()
	{
		pinOTP.sendKeys("982278");
	}
	public void clickoncontinuebutton()
	{
		continuebutton.click();
	}
    public void clickonusername()
    {
    	username.click();
    }
    public void clickonlogoutbutton()
    {
    	logoutbutton.click();
    }
    
}
