package testcases;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wrappers.*;
@Test
public class Testcase_03 extends LinkedInWrappers  {
	
	public void execute_03() throws InterruptedException, MalformedURLException 
	{
		invokeApp("chrome", "https://www.linkedin.com/");
		loginLinkedIn("mdhussain16@gmail.com", "chennai63");
		clickByLinkText("Profile");
		String data1="selenium";
		Thread.sleep(5000);
		List<WebElement> skills= findAllElementsByXPath("//*[@id='profile-skills'] ");
		 int size = skills.size();
		 System.out.println(size);
		String result = "false";
		
		//label1:
		
		for (WebElement webElement1 : skills)
		{
			System.out.println(webElement1);
			if(webElement1.equals(data1))
			{
				result ="true";
				System.out.println("skill already exist");
				break;
			}
			
			
		}
		
		
		while(result.equalsIgnoreCase("false"))
         {
			Thread.sleep(5000);
	clickByXPath("//*[@id='background-skills']/button");
	enterById("edit-skills-add-ta", "selenium");
	clickById("edit-skills-add-btn");
	clickByXPath("//*[@id='skills-editor-form']/p/input");
	  // continue label1;
	   
        
		
		}
			
			
		//String result = verifyTextByXPath("//*[@id='profile-skills']/ul/li[1]/span/span[2]", "SQL");
	    
		
	}

}
