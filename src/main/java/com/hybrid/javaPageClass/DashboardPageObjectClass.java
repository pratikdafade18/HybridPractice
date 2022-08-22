package com.hybrid.javaPageClass;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageObjectClass {

	public static  WebDriver driver ;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[3]/div/nav/div/button")
	WebElement logout;
    
	public DashboardPageObjectClass(WebDriver driver) {
		
		this.driver=driver;
        PageFactory.initElements(driver, this);
		
		
	}

    public void ClickOnLogoutBtn() {
    	
    	logout.click();
    }


}
