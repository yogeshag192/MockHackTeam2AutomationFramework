package com.HackathonUITests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public String readProp(String key) throws IOException{
		FileInputStream fis = new FileInputStream (new File(System.getProperty("user.dir"))+File.separator+"data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

}
