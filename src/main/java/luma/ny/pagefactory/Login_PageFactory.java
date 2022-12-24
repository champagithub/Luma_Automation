package luma.ny.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.ny.basepage.BasepageClass;
import luma.ny.generics.CommonUtilitiesClass;
import luma.ny.generics.WaitHelperClass;

public class Login_PageFactory extends BasepageClass {
	public Login_PageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	@CacheLookup
	 private WebElement clickSignInBTN;
	public WebElement getClickSignInBTN() {
		return clickSignInBTN;
	}
	
	@FindBy (xpath = "//input[@id = 'email']")
	@CacheLookup
	 private WebElement enterUserName;
	public WebElement getEnterUserName() {
		return enterUserName;
	}	
	@FindBy (xpath = "(//input[@id = 'pass'])[1]")
	@CacheLookup
	 private WebElement enterPassWord;
	public WebElement getEnterPassWord() {
		return enterPassWord;
	}
	@FindBy (xpath="//*[@id=\"send2\"]/span")
	@CacheLookup
	 private WebElement ClickLogin;
	public WebElement getClickLogin() {
		return ClickLogin;
	}
	
	
	@FindBy (xpath="(//span[text()='Welcome, Smart Tech!'])[1]")
	@CacheLookup
	 private WebElement Landingpage;
	public WebElement getLandingpage() {
		return Landingpage;
	}
	
	@FindBy (xpath="//span[text()='Men']")
	@CacheLookup
	 private WebElement menModule;
	public WebElement getmenModule() {
		return menModule;
	}
	
	@FindBy (xpath=("(//*[text()='Tops'])[2]"))
	@CacheLookup
	 private WebElement selectTops;
	public WebElement getSelectTops() {
		return  selectTops;
	}
	
	@FindBy (xpath="(//*[text()='Jackets'])[2]")
	@CacheLookup
	 private WebElement selectjackets;
	public WebElement getSelectJackets() {
		return  selectjackets;
	}
	@FindBy (xpath="(//a[@class='product-item-link'])[3]")
	@CacheLookup
	 private WebElement selectJupiterJacket;
	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;
	}
	
	
	@FindBy (xpath="(//*[text()='M'])[1]")
	@CacheLookup
	 private WebElement selectSize;
	public WebElement getSelectSize() {
		return  selectSize;
	}
	@FindBy (xpath="(//div[@class='swatch-option color'])[1]")
	@CacheLookup
	 private WebElement selectColor;
	public WebElement getSelectColor() {
		return  selectColor;
	}
	@FindBy (xpath="//*[@name='qty']")
	@CacheLookup
	 private WebElement selectQuantity;
	public WebElement getSelectQuantity() {
		return  selectQuantity;
	}	
	
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	@CacheLookup
	 private WebElement selectAddToCart;
	public WebElement getSelectAddToCart() {
		return  selectAddToCart;
	}
	
	
	@FindBy (linkText="shopping cart")
	@CacheLookup
	 private WebElement clickShoppingCart;
	public WebElement getClickShopingCart() {
		return clickShoppingCart;
	}
	
	@FindBy (xpath="//span[text()='Proceed to Checkout']")
	@CacheLookup
	 private WebElement proceedTocheckout;
	public WebElement getClickProceedToCart() {
		return proceedTocheckout;
	}
	
	@FindBy (xpath="//*[text()='New Address']")
	@CacheLookup
	 private WebElement addNewAddress;
	public WebElement getClickAddNewAddress() {
		return addNewAddress;
	}
	//Address Details
	@FindBy (xpath="//input[@name='firstname']")
	@CacheLookup
	 private WebElement addFirstName;
	public WebElement getaddFirstName() {
		return addFirstName;
	}
	@FindBy (xpath="(//input[@class='input-text'])[7]")
	@CacheLookup
	 private WebElement addLastName;
	public WebElement getaddLastName() {
		return addLastName;
	}
	
	@FindBy (xpath="(//input[@class='input-text'])[8]")
	@CacheLookup
	 private WebElement addCompanyName;
	public WebElement getaddCompanyName() {
		return  addCompanyName;
	}
	
	@FindBy (xpath="(//input[@class='input-text'])[9]")
	@CacheLookup
	 private WebElement addStreetName;
	public WebElement getaddStreetName() {
		return  addStreetName;
	}
	
	@FindBy (xpath="(//input[@class='input-text'])[12]")
	@CacheLookup
	 private WebElement addCityName;
	public WebElement getaddCityName() {
		return  addCityName;
	}
	
	@FindBy (xpath="(//*[@class='select'])[1]")
	@CacheLookup
	 private WebElement selectStatName;
	public WebElement getSelectStatName() {
		return   selectStatName;
	}
	
	@FindBy(xpath="(//input[@type='text'])[10]")// xpath good here..............
	@CacheLookup
	 private WebElement addZipCode;
	public WebElement getaddZipCode() {
		return   addZipCode;
	}
	
	@FindBy (xpath="(//select[@class='select'])[2]")
	@CacheLookup
	 private WebElement addCountryName;
	public WebElement getaddCountryName() {
		return   addCountryName;
	}
	
	@FindBy (xpath="(//input[@type='text'])[11]")
	@CacheLookup
	 private WebElement addPHoneNumber;
	public WebElement getaddPHoneNumber() {
		return   addPHoneNumber;
	}
	@FindBy (xpath="//span[text()='Ship here']")
	@CacheLookup
	 private WebElement clickShipHere;
	public WebElement getclickShipHere() {
		return   clickShipHere;
	}
	@FindBy (xpath="(//select[@class='select'])[1]/option")
	@CacheLookup
	 private WebElement selectDropDownt;
	public WebElement getSelectDropDown() {
		return   selectDropDownt;
	}
	
	//Address Details...
	public void getAddShippingDetails() {
		getaddFirstName().clear();
		//WaitHelperClass.staticwaitShorter();
		WaitHelperClass.seleniumWait(getaddFirstName(), 30);
		getaddFirstName().sendKeys("champa");
		
		getaddLastName().clear();
		WaitHelperClass.seleniumWait( getaddLastName(), 30);
		getaddLastName().sendKeys("nandi");
		 
		getaddCompanyName().clear();
		 WaitHelperClass.seleniumWait(getaddCompanyName(), 30);
		 getaddCompanyName().sendKeys("SmartTech");
		 
		 
		// getInputStreetName().sendKeys("jackson ht");
		 getaddStreetName().clear();
		 WaitHelperClass.seleniumWait(getaddStreetName(), 30);
		 getaddStreetName().sendKeys("82Street");
		 
		 getaddCityName().clear();
		 WaitHelperClass.seleniumWait(getaddCityName(), 30);
		 getaddCityName().sendKeys("queens");
		 
		 
		 //getSelectStatName().clear();
		 WaitHelperClass.seleniumWait(getSelectStatName(), 30);
		 CommonUtilitiesClass.getSelectValue(getSelectStatName(),"New York");
		 
		 getaddZipCode().clear();
		 WaitHelperClass.seleniumWait(getaddZipCode(),30);
		 getaddZipCode().sendKeys("11370");
		 
		 //getSelectCountryName().sendKeys("");
		 WaitHelperClass.seleniumWait(getaddCountryName(),30);
		 CommonUtilitiesClass.getSelectValue(getaddCountryName(),"United States");
		 
		 getaddPHoneNumber().clear();
		 WaitHelperClass.seleniumWait(getaddPHoneNumber(), 30);
		 getaddPHoneNumber().sendKeys("9295699072");
		 
		 
		 WaitHelperClass.seleniumWait(getclickShipHere(), 30);
		 CommonUtilitiesClass.getActionClick(getclickShipHere());
	}

	
	public void getLogin() {
		log.info("user able to clickSign In button");
		WaitHelperClass.seleniumWait(clickSignInBTN, 30);
		CommonUtilitiesClass.getActionClick(getClickSignInBTN());
		//getClickSignInBTN().click();
		
		log.info("user able to enter user name");
		WaitHelperClass.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));
		
		
		
		log.info("user able to enter password");
		WaitHelperClass.seleniumWait(getEnterPassWord(), 30);
		 getEnterPassWord().sendKeys(prop.getProperty("passWord"));
		 
			
			log.info("user able to click login");
			WaitHelperClass.seleniumWait(getClickLogin(), 30); 
			CommonUtilitiesClass.getActionClick(getClickLogin());
		//getClickLogin().click();
			
			log.info("User able verify the text");
			WaitHelperClass.seleniumWait(getLandingpage(), 30);
			CommonUtilitiesClass.getActionClick(getLandingpage());
	
	
}
}