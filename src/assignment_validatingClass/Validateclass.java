package assignment_validatingClass;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import assignment_baseClasss.BaseClasses;
import assignment_testcasesClass.Vctc_test;
import assignment_utilityclass.Utility;

public class Validateclass extends BaseClasses {
	 Vctc_test page;
	 
	 @BeforeClass
	 public void launchbrowser() {
		 openBrowser();
		 Utility.wait(driver, 100);
		 page= new Vctc_test(driver);
	 }
	 
	
  @Test
  public void ScreenshotAndScrolling () throws IOException {
	  Utility.scroll(driver, page.radio2());
	  Utility.takeScreenshot(driver);
	  Utility.wait(driver, 100);
	  Utility.scroll(driver, page.table());
	  Utility.takeScreenshot(driver);
	  Utility.wait(driver, 100);
	  
	  Utility.scroll(driver, page.iframe());
	  Utility.takeScreenshot(driver);
	  Utility.wait(driver, 100);
  }
}
