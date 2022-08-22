package com.hybrid.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	
	String path ="F:\\Java Demo\\Testing\\Hybridframework\\Configuration\\Config.properties";
	
	public ReadConfig() {
		
		prop = new Properties();
		
		try {
			FileInputStream f = new FileInputStream(path);    //exception handled by try & cache
			prop.load(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public String getBaseurl() {
		
		String value = prop.getProperty("baseURL");
		
		if (value!=null) {
		
		return value;
	}
	else {
		
		throw new RuntimeException("URL NOT SPECIFIED IN CONFIG FILE");
	}
}

public String getBrowser() {
		
		String browser = prop.getProperty("browser");
		
		if (browser!=null) {
		
		return browser;
	}
	else {
		
		throw new RuntimeException("BROWSER NOT SPECIFIED IN CONFIG FILE");
	}
}
	
	
}
