package testcases;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.*;
@Test
public class Testcase_06 extends LinkedInWrappers
{
	public void execute_06() throws InterruptedException, MalformedURLException
	{

	invokeApp("chrome", "https://www.linkedin.com/");
	loginLinkedIn("mdhussain16@gmail.com", "chennai63");
	Thread.sleep(10000);
	clickByXPath("//*[@id='account-nav']/ul/li[1]/a"); //*[@id="header-navigation-utilities"]/ul/li[1]/a
	
	//Thread.sleep(10000);
	
	//clickByXPath("//*[@id='inbox-overlay-messages-header']/a"); //*[@id="inbox-overlay-messages-header"]/a
	clickById("compose-button");
	Thread.sleep(5000);
	clickByXPath("//*[@id='enter-to-send-checkbox']");
	
	enterById("pillbox-input", "Althaf Hussain");
	Thread.sleep(2000);
	//clickByXPath("//*[@id='pillbox-list']/span/pre");  //*[@id="pillbox-list"]/span/pre
	clickByXPath("//*[@id='pillbox-container']/div[1]/span");
	//selectByIDByIndex("pillbox-input", 1);
	Thread.sleep(2000);
	enterById("compose-message", "hi");
	Thread.sleep(5000);
	clickByClassName("message-submit");
	String result=verifyTextByXPath("//*[@id='messages-list-wrapper']/ul/li[6]/div[2]/div[2]/div[2]/div/h4/p", "hi");
		System.out.println(result);//*[@id="messages-list-wrapper"]/ul/li[3]/div[2]/div[2]/div[2]/div/h4/p;
		//*[@id="messages-list-wrapper"]/ul/li[4]/div[2]/div[2]/div[2]/div/h4/p
	
		
	
	}
	
}
