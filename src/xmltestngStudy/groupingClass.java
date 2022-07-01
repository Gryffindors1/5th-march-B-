package xmltestngStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupingClass {
	@Test(groups = "sanity")
	 public void myMethod1()
	 {
	 Reporter.log("my Method1 sanity is Running",true);
	 }
	@Test(groups = "sanity")
	 public void myMethod2()
	 {
	 Reporter.log("my Method2 is Running",true);
	 }
	@Test(groups = "regression")
	 public void myMethod3()
	 {
	 Reporter.log("my Method3 regression is Running",true);
	 }
	@Test
	 public void myMethod4()
	 {
	 Reporter.log("my Method4 is running ", true);
	 }
	@Test(groups = "regression")
	 public void myMethod5()
	 {
	 Reporter.log("my Method5 regression is Running",true);
  }
}
