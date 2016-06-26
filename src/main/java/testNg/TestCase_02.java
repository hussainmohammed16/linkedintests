package testNg;
import org.testng.annotations.Test;
import wrappers.*;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCase_02 extends LinkedInWrappers 
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

	@Test(groups={"advancedsearch"})
	public void execute_02() throws InterruptedException
	{
	 // invokeApp("chrome", "https://www.linkedin.com/");
	//  loginLinkedIn("mdhussain16@gmail.com", "chennai63");
		//@AfterMethod
		//quitBrowser();
		
	  clickById("advanced-search");
	  Thread.sleep(5000);
	  clickByXPath("//*[@id='advs']/div[1]/button");//*[@id="advs"]/div[1]/button
	  Thread.sleep(5000);
	  clickByXPath("//*[@id='pivot-bar']/ul/li[2]/button");
	  Thread.sleep(5000);
	  clickByXPath("//*[@id='pivot-bar']/ul/li[2]/button");
	  Thread.sleep(5000);
	  String result = getTextByXPath("//*[@id='results_count']/div/p/strong[1]");
	  System.out.println(result);
	  String result1 =verifyTextByXPath("//*[@id='results_count']/div/p/strong[1]", result);
	  if(result1.equalsIgnoreCase("true"))
	  System.out.println("same text exist");
	  else 
	  System.out.println("different text");
	  
	//*[@id="pivot-bar"]/ul/li[2]/button
	//*[@id="pivot-bar"]/ul/li[3]/button
	//*[@id="pivot-bar"]/ul/li[2]/button
	  
		  
	  
	
	  
	}

}
