package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeTest
	public void setUp() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(
					"C:\\eclipse-workspace\\SeleniumAutomationFramework\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			driver.get(prop.getProperty("testurl"));
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			driver.get(prop.getProperty("testurl"));
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Tear down process was seccessful");
	}

}
