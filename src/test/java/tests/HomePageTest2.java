package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;

public class HomePageTest2 extends TestBase {
	
	HomePage hp;
	
	public HomePageTest2() 
	{
		super();
	} 
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browserName) throws MalformedURLException 
	{
		initialization(browserName);
		hp = new HomePage();
	}
	
	
	@Test
	public void verifyLoginLink() 
	{
		
		hp.search("Firmino");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}

}
