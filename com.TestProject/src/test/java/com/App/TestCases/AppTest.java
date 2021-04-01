package com.App.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.App.Utilities.AppBrowserClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
   public static AppBrowserClass browser;
   public static WebDriver driver;
   
   @BeforeSuite
   public void setupsuite() {
	
	   
   }
	
	@BeforeTest
	public void launchbrowser() {
	
		
		
	}
	
	
	
	
    @Test
    public void verifyMaven()
    {
    	
    	
    	System.out.println("Maven Selenium");
    	System.out.println("Java Selenium");
    	System.out.println("Python Selenium");
    	System.out.println("Ruby Selenium");
    	System.out.println("VBScript Selenium");
    	System.out.println("Git Project");
       
        
        
        
    }
}
