package com.hybrid.testClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
    //chukich import file
import org.testng.log4testng.Logger;

import com.hybrid.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
    
	
	public static WebDriver driver ;
	
	 public static Logger logger;   //chukich import ok now
	
	
	ReadConfig rr = new ReadConfig();
	
	String url = rr.getBaseurl();
	String browser =rr.getBrowser();
	
	
	@BeforeSuite
	public void Setup() {
		
		switch (browser.toLowerCase()) {
		
		case "chrome" :
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
		case "firefox" :
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;	
			
		case "edge" :
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();	
		break;
		
		case "opera" :
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
			
		
		break;
		default:
			driver=null;
			break;
		}
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//    logger = LogManager.getLogger("Hybridframework");
	}
	@AfterSuite
	
	
	public void Tearup() {
		
		driver.close();
	}
	
	public void caputureScreenShot(WebDriver driver,String testname) throws IOException {              //for Scrren shot capture code
		
		TakesScreenshot sc = ((TakesScreenshot)driver);
	
		File src =sc.getScreenshotAs(OutputType.FILE);
	    
		File dest=new File (System.getProperty("user.dir")+"//Screenshot//"+ testname + ".png" );
	    
		FileUtils.copyFile(src, dest);
	
	}
	
}
