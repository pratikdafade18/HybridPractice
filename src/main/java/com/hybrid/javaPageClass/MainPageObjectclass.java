 package com.hybrid.javaPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjectclass {

	WebDriver driver;
	
	@FindBy(id="w3loginbtn")
	WebElement MainLoginBtn;
	
	
	 public MainPageObjectclass(WebDriver driver) {
		
		 this.driver=driver;
	     PageFactory.initElements(driver, this);
	 }
		
	 
	 public void ClickLoginBtn() {
		 
		 MainLoginBtn.click(); 
	 }
	  

	 
}
	
	
	
	
	

