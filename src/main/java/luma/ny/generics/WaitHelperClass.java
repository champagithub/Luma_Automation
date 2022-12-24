package luma.ny.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.ny.basepage.BasepageClass;

public class WaitHelperClass  extends  BasepageClass{
	
	public static void seleniumWait(WebElement ele,long time) {		
		WebDriverWait wait= new WebDriverWait(driver,time);
		//wait.until(ExpectedConditions.visibilityOf(ele));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	/*public static void staticwaitShorter() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/

}
