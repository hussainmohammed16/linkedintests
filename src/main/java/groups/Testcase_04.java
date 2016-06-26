package groups;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.LinkedInWrappers;
import wrappers.WrapperMethods;

public class Testcase_04  extends ExcelData

{
	
	@BeforeMethod(groups={"advancedsearch"})
	@Parameters({"browser","url","username1","password1"})
	public void declarevariables(String browser,String url,String username1,String password1) throws MalformedURLException
	{
	//String browser ="Chrome";
	//String url ="https://www.linkedin.com";
	//String username1 ="mdhussain16@gmail.com";
	//String password1="chennai63";
	invokeApp(browser,url);
	
	
	loginLinkedIn(username1,password1);
	
	}
	
	@Test(dataProvider ="exceldata")
	public void execute04(String data) throws InterruptedException, MalformedURLException
	{
		// TODO Auto-generated method stub
		// invokeApp("chrome", "https://www.linkedin.com/");
		// loginLinkedIn("satapathy.asish@gmail.com", "mitume");
		 
		 
		 clickByLinkText("Jobs");//("//*[@id='main-site-nav']/ul/li[5]/a");
		 enterById("job-search-box", data);
		 clickByName("jsearch");
		 Thread.sleep(5000);
		 
		// driver.findElement(By.xpath("//*[@id='results']/li[1]/div/div[3]"))
		 String  buttonColor = getCSSValueByXpath("//*[@id='results']/li[1]/div/div[3]/a","background-color");
		
      // System.out.println(buttonColor);
		// if())
		System.out.println("its blue");
		Thread.sleep(2000);
		 clickByXPath("//*[@id='results']/li[2]/div/div[3]/a");
		 Thread.sleep(2000);
		String companyname = getTextByXPath("//*[@id='top-card']/div/div[1]/div[2]/h3[1]/a/span[1]");
		System.out.println(companyname);
		
		clickByXPath("//*[@id='top-card']/div/div[1]/div[2]/h3[1]/a/span[1]");
		Thread.sleep(2000);
		String employeeconunt =getTextByXPath("//*[@id='body']/div[2]/div[1]/div[1]/div/p[3]");
		System.out.println(employeeconunt);
		//quitBrowser();
		
		
		
		 
		 
		
	}

}
