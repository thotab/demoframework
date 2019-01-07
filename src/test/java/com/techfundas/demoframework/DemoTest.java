package com.techfundas.demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DemoTest {

//public static void main(String[] args)
	WebDriver driver;
	@Test
	public void validateLaunch()
	{
		// TODO Auto-generated method stub
		
		String env ="winCromePath";
		String winCromePath ="C:/Users/Kalyan/eclipse-workspace/demoframework/src/test/java/Resources/chromedriver.exe";
	//	String winLinusPath ="C:/Users/Kalyan/eclipse-workspace/demoframework/src/test/java/Resources/chromedriver";
		
		if(env.equals("winCromePath"))
			{ System.setProperty("webdriver.chrome.driver",winCromePath); }
			else { System.out.println("Nothing");  }
		
		//	{ System.setProperty("webdriver.chrome.driver","winLinusPath");}
		
		 driver =new ChromeDriver();
System.out.println("Chrome Browser Launched");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
