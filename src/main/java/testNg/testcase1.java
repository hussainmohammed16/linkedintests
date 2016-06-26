package testNg;


import java.net.MalformedURLException;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.LinkedInWrappers;




public class testcase1 extends LinkedInWrappers 

{
	
	@BeforeMethod()
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
	//@BeforeMethod
	
	@Test(groups={"testcase1.execute_01"})
	
	public void execute_01() throws InterruptedException

	{
		// TODO Auto-generated method stub
		
		
		
		clickById("advanced-search");
		enterById("advs-keywords", "selenium");
		clickById("adv-F-N-ffs");
		clickById("adv-S-N-ffs");
		clickByName("submit");
		Thread.sleep(5000);
		String searchresult= getTextByXPath("//*[@id='results_count']/div/p/strong[1]");
		System.out.println(searchresult);
		String firstname  = getTextByLinkText("Saravanan Ravikumar");
		System.out.println(firstname);
		String connection = getTextByXPath("//*[@id='results']/li[1]/div/h3/span/span/abbr");
		System.out.println(connection);
		Thread.sleep(5000);
	    quitBrowser1();
	//	Thread.sleep(5000);
	//	invokeApp1(browser,url);
	//	loginLinkedIn(username,password);
		

	}
	
	
	

}
