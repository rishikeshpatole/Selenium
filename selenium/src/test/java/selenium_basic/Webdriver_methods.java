package selenium_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Webdriver_methods 
{
	public static void main(String [] args)
	{
		BrowserLaunch bl= new BrowserLaunch();
		WebDriver driver= bl.browserLaunch("chrome");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Current Page Tilte :"+driver.getTitle());
		System.out.println("Current URl : "+driver.getCurrentUrl());
		
		driver.quit();
	}
}
