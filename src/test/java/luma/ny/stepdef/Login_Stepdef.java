package luma.ny.stepdef;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.*;
import luma.ny.basepage.BasepageClass;
import luma.ny.generics.CommonUtilitiesClass;
import luma.ny.generics.WaitHelperClass;
import luma.ny.pagefactory.Login_PageFactory;


public class Login_Stepdef extends BasepageClass{
	Login_PageFactory pf;

@Given("User already logged in the application and verify the user information on the landing page")
public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
 pf=PageFactory.initElements(driver, Login_PageFactory.class);
 pf.getLogin();
 
String expected =prop.getProperty("LandingpageTitle");
 WaitHelperClass.seleniumWait(pf.getLandingpage(), 30);
String actual=pf.getLandingpage().getText();
log.info("user able to verifi login page");
Assert.assertEquals(actual, expected);
 
  
}
@When("User should be able to select Jupiter All-Weather Trainer jacket from men module")
public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
	log.info("user able to mouseHover over the menModule");
WaitHelperClass.seleniumWait(pf.getmenModule(), 30);
 CommonUtilitiesClass.getMouseHover(pf.getmenModule());
 
 log.info("user able to mouseHover Tops");
 WaitHelperClass.seleniumWait(pf.getSelectTops(), 30);
 CommonUtilitiesClass.getMouseHover(pf.getSelectTops());
 
 log.info("user able to click Jacket");
 WaitHelperClass.seleniumWait(pf.getSelectJackets(), 30);	
 //CommonUtilitiesClass.getMouseHover(pf.getSelectJackets()); //if action class not work use JavaScreept
 CommonUtilitiesClass.getJSClick(pf.getSelectJackets());
 
 log.info("user able to verify specific Jacket");
 String expected =prop.getProperty("JacketName");		
 WaitHelperClass.seleniumWait(pf.getSelectJupiterJacket(), 30);
 String actual=pf.getSelectJupiterJacket().getText();
 Assert.assertEquals(expected, actual);
 CommonUtilitiesClass.getAssert(expected, actual);
 
 
}
@When("Verify the jacket name on the Jupiter All-Weather Trainer list")
public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
	 log.info("user able to verify specific Jacket");
	 WaitHelperClass.seleniumWait(pf.getSelectJupiterJacket(), 30);
	// prop.getProperty("JacketName");//   need to check this line
	 CommonUtilitiesClass.getJSClick(pf.getSelectJupiterJacket());


}
@When("User should be able to select the M and Blue and {int} then click on the add to cart")
public void user_should_be_able_to_select_the_m_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {
	log.info("user able to select size");
	 WaitHelperClass.seleniumWait(pf.getSelectSize(), 30);
	 CommonUtilitiesClass.getActionClick(pf.getSelectSize());
	 CommonUtilitiesClass.getActionClick(pf.getSelectSize());
	 
	 log.info("user able to select color");
	 WaitHelperClass.seleniumWait(pf.getSelectColor(), 30);
	 CommonUtilitiesClass.getJSClick(pf.getSelectColor());
	 

	 log.info("user able to select the quantity");
	 WaitHelperClass.seleniumWait(pf.getSelectQuantity(), 30);
	 pf.getSelectQuantity().clear();// this line is for make sure qty is 1
	pf.getSelectQuantity().sendKeys("1");
	 
	 log.info("user able add to cart");
	 WaitHelperClass.seleniumWait(pf.getSelectAddToCart(), 30);
	 CommonUtilitiesClass.getJSClick(pf.getSelectAddToCart());
	 
	
	 log.info("user able add shopping cart");
	 WaitHelperClass.seleniumWait(pf.getClickShopingCart(), 30);
	 CommonUtilitiesClass.getJSClick(pf.getClickShopingCart());	 
  
}
@When("User should be able to click on the cart and checkout")
public void user_should_be_able_to_click_on_the_cart_and_checkout() {
	log.info("user able to checkOut");
	 WaitHelperClass.seleniumWait(pf.getClickProceedToCart(), 30);
	 CommonUtilitiesClass.getJSClick(pf.getClickProceedToCart());	

  
}
@When("User should be able to enter the shipping details and click on the Next")
public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
	log.info("user able to click on new address");
	WaitHelperClass.seleniumWait(pf.getClickAddNewAddress(), 30);
	 CommonUtilitiesClass.getJSClick(pf.getClickAddNewAddress());	
	 
  
}
@When("User should be able to verify the shipping address and place the order")
public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
pf.getAddShippingDetails();
  
}
@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
 
  
}

}
