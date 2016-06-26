package testcases;
import wrappers.*;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

@Test
public class TestCase_02 extends LinkedInWrappers {
	
	public void execute_02() throws InterruptedException, MalformedURLException
	{
	  invokeApp("chrome", "https://www.linkedin.com/");
	  loginLinkedIn("mdhussain16@gmail.com", "chennai63");
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
	  System.out.println("same text exist in web");
	  else 
	  System.out.println("different text");
	  
	//*[@id="pivot-bar"]/ul/li[2]/button
	//*[@id="pivot-bar"]/ul/li[3]/button
	//*[@id="pivot-bar"]/ul/li[2]/button
	  
		  
	  
	
	  
	}

}
