package tt.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class setupDrivers {
	
	public static WebDriver driver;
	
	public static void setupDriver() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().browserVersion("88.0.4324.96").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		//setupDrivers.driver.get("https://www.ebay.com/");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>setup driver class");
		Thread.sleep(3000);
	}
	
public static WebDriver getDriver() {                  // getDriver() is a return type and setDriver() is void type method
	
	return driver;
}

public static void tearDownDriver() {
	
	driver.quit();
}

}
