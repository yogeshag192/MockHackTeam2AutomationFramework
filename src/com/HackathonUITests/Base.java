package com.HackathonUITests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Base {
	
	public static WebDriver driver;
	public ReadProperty obj1;
	
	@BeforeSuite()
	public void launchURL() throws IOException{

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\INNOVATION LAB\\Documents\\Team2-Test\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Launching chrome browser..");
		
		obj1 = new ReadProperty();
		driver.get(obj1.readProp("url"));
		System.out.println(obj1.readProp("url"));
		
	}
	
	@AfterSuite
	public void TearDown(){
		System.out.println("driver closed..");
		driver.quit();
		
	}

}
