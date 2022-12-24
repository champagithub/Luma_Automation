package luma.ny.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.ny.basepage.BasepageClass;

public class  HooksClass extends BasepageClass{
	
	 
	@Before
	public void getSetup() {
		BasepageClass.startAutomation();
			
	}
	@After
	public void getTearDown() {
		//driver.quit();
	}

}
