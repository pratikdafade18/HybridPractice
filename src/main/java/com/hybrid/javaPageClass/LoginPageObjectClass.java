package com.hybrid.javaPageClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectClass {

	WebDriver driver;
	
	 @FindBy(id="modalusername")
	 WebElement email;
	 
	 
	 @FindBy(xpath="/html/body/div[1]/div/div/div[4]/div[1]/div/div[2]/form/div[2]/div[2]/input")
	  WebElement password;
	
	 @FindBy(xpath="/html/body/div[1]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")
	 WebElement Loginbtnclick;
	 
	public LoginPageObjectClass(WebDriver driver) {
		
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
		
	 
	 public void enterCredentials(String em , String pass) {
		 
		 email.sendKeys(em);
		 password.sendKeys(pass);
		 
	 }
	
	 public void Loginbtn() {
		 
		 Loginbtnclick.click();
	 }

	
}
