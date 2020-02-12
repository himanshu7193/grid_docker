package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name = "q")
	WebElement searchLink;
		
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}

	 
	public void search(String searchText) 
	{
		searchLink.sendKeys(searchText);
		searchLink.submit();
	}
	
}
