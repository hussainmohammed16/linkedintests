package wrappers;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import testcases.testcase1;

public class LinkedInWrappers extends WrapperMethods
{
	
	
	
	
	@BeforeSuite(groups={"advancedsearch","profile"})
	public void beforesuite()
	{
		System.out.println("@Beforesuite");
		
	}
	
	@BeforeTest(groups={"advancedsearch","profile"})
	public void beforetest()
	{
		System.out.println("@beforetest");
		
	}
	

	
	@BeforeClass(groups={"advancedsearch","profile"})
	public void beforeclass()
	{
		System.out.println("@beforeclass");
		
	}
	
	//@BeforeMethod
	public boolean invokeApp1(String browser1,String url1) 
	{	
		try
		{
			if ( browser1.equalsIgnoreCase("Chrome"))
			{
				//System.setProperty("webdriver.chrome.driver",ChromeDriverLocation);
				driver = new ChromeDriver();
				
			}
			else if(browser1.equalsIgnoreCase("Firefox"))
			{
				driver = new FirefoxDriver();
				
			}
			driver.get(url1);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return true;
		}
		catch(WebDriverException e)
		{
			System.out.println("Browser not opened"+e);
			//return false;
		}
		return false;
		
	}

	
	//@BeforeMethod
	public boolean loginLinkedIn(String username1, String password1)
	{
		
		try {
			driver.findElementById("login-email").sendKeys(username1);
			driver.findElementById("login-password").sendKeys(password1);
			driver.findElementByName("submit").click();
			System.out.println("beforemethod");
		} catch (NoSuchElementException e) {
			
			System.out.println("Element for User Login is not found");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@AfterSuite(groups={"advancedsearch","profile"})
	public void aftersuite()
	{
		System.out.println("@aftersuite");
		
	}
	
	@AfterClass(groups={"advancedsearch","profile"})
	public void afterclass()
	{
		System.out.println("@afterclass");
		
	}
	
	
	@AfterTest(groups={"advancedsearch","profile"})
	public void afteretest()
	{
		System.out.println("@aftertest");
		
	}
	
	
	@AfterMethod(groups={"advancedsearch","profile"},alwaysRun=true)
	public boolean quitBrowser1() {
		driver.quit();
		System.out.println("browser closed");
		return false;
	}
	

	
	
	
	
}
