package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(
					"/Users/himanshu.singh/workspace_java/grid_docker/src/main/java/config/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initialization(String browserName) throws MalformedURLException {

		if (browserName.equalsIgnoreCase("chrome")) {
			DesiredCapabilities cap = new DesiredCapabilities().chrome();
			URL url_hub = new URL("http://localhost:4444/wd/hub");

			driver = new RemoteWebDriver(url_hub, cap);

			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("chrome launched");

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			DesiredCapabilities cap = new DesiredCapabilities().firefox();
			URL url_hub = new URL("http://localhost:4444/wd/hub");

			driver = new RemoteWebDriver(url_hub, cap);

			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("firefox launched");

		}

//		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));

	}

}
