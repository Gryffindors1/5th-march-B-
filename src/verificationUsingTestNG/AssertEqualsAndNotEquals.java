package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void myTC1() {
	  
	  String m ="nanded";
	  String s = "akshay";
	  
	  //Assert.assertEquals(m, n, "Strings are matching TC is failed");
	  //Reporter.log("Strings are matching TC is PASSED", true);
	  
	  Assert.assertNotEquals(m, s, "Strings are  matching TC is failed");
 Reporter.log("Strings are not matching TC is PASSED", true);

	  
	  

	  
  }
}
