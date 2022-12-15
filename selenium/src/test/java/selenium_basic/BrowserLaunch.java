package selenium_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{
	static WebDriver driver;

	public WebDriver browserLaunch(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\Selenium\\selenium\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
		}	
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\git\\Selenium\\selenium\\Browser\\geckodriver.exe");
		driver= new FirefoxDriver();
		}
		return driver;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		BrowserLaunch bl= new BrowserLaunch();
		driver=bl.browserLaunch("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println("Chrome Launched Successfully");
		driver.close();
		
		
		Thread.sleep(10000);
		
		driver=bl.browserLaunch("firefox");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println("Firefox launched Successfully");
		driver.close();

	}
}
