package grid_docker.grid_docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest1 {

	@Test
	public void test() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		URL url = new URL("http://localhost:4444/wd/hub");

		RemoteWebDriver driver = new RemoteWebDriver(url, cap);

		driver.get("https:google.com");
		driver.findElement(By.name("q")).sendKeys("Bobby Firmino");
		String title = driver.getTitle();
		System.out.println("From Chrome: " + title);
		
		driver.quit();
	}

}
