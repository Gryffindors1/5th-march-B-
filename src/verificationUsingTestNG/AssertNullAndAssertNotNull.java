package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNull {
  @Test
  public void myTC2() {
	  
	  String s=null;
	  
	  
	  
	 // Assert.assertNotNull(m, "value is Null TC is failed");
	 // Reporter.log("value is not null TC is PASSED",true);
	  
	  Assert.fail();
	  Assert.assertNull(s, "value is not Null TC failed");
	  Reporter.log("value is null TC is passed",true);

  }
}
