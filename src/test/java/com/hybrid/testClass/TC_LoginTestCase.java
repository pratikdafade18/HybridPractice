package com.hybrid.testClass;

import java.util.logging.Logger;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hybrid.javaPageClass.DashboardPageObjectClass;
import com.hybrid.javaPageClass.LoginPageObjectClass;
import com.hybrid.javaPageClass.MainPageObjectclass;

@Listeners(com.hybrid.Utilities.ExtendsListnerClass.class)    //path of write a code for listener com.hybrid.Utilities.ExtendsListnerClass.class 
public class TC_LoginTestCase extends BaseClass{

	 
	    
		
		@Test(priority = 1,description = "Login Functionality")
		public void Login() throws InterruptedException {
			
			driver.get(url);                              //enter URl 
	//		Logger.info("URL IS Entered");
			driver.manage().deleteAllCookies();
	//		Logger.info("Cookies is deleted");
			driver.manage().window().maximize();
		    
		    
		    
		    MainPageObjectclass m =new MainPageObjectclass(driver);  //click on LOGIN
		    m.ClickLoginBtn();
	//	    Logger.info("MAINPAGE Login Button Is Click");
		    Thread.sleep(2000);

		    LoginPageObjectClass l = new LoginPageObjectClass(driver);
		    l.enterCredentials("shubhamshedge810@gmail.com", "AdminShubham@123");    //enter credentials
	//	    Logger.info("Credentilas IS Entered");
		    l.Loginbtn();
		    Thread.sleep(20000);
		    
		    DashboardPageObjectClass d = new DashboardPageObjectClass(driver);    //enter logout btn
		    d.ClickOnLogoutBtn();
//		    Logger.info("Logout Button IS Click");
		    Thread.sleep(2000);
		}
	
	
	
}
