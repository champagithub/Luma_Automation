package luma.ny.generics;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.ny.basepage.BasepageClass;



public class CommonUtilitiesClass extends  BasepageClass {
	
	public static void getActionClick(WebElement ele) {
		Actions click= new Actions(driver) ;
		click.click(ele).build().perform();	
		
	}
	public static void getMouseHover(WebElement ele) {
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
		
public static void getAssert(String expected,String actual) {
	Assert.assertEquals(expected, actual);
	log.info("verified Text" + actual);
	System.out.println("verified Text" + actual);
		
	}

public static void getSelectDropDown(List<WebElement> ele,String text) {
	List<WebElement> option =ele;
	for(WebElement newValue : option) {
	if(newValue.getText().contains("text")) {
		getActionClick(newValue);
	}
}
}




public static void getJSClick(WebElement ele) {
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", ele);
}

public static void getSelectValue(WebElement ele, String text) {
	Select sc = new Select(ele);
	sc.selectByVisibleText(text); 
	
}
}

