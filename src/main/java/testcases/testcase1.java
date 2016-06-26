package testcases;


import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.LinkedInWrappers;

@Test
public class testcase1 extends LinkedInWrappers 

{
	
	public void execute_01() throws InterruptedException, MalformedURLException

	{
		// TODO Auto-generated method stub
		invokeApp("chrome", "https://www.linkedin.com");
		
		loginLinkedIn("mdhussain16@gmail.com", "chennai63");
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
		quitBrowser();
		
		

	}
	

}
