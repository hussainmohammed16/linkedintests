package groups;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import wrappers.*;

public class Testcase_03 extends ExcelData  {
	
	@BeforeMethod(groups ="profile")
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

	@Test(dataProvider="exceldata")
	//@Parameters("selenium")
	public void execute_03(String selenium) throws InterruptedException 
	{
	//	invokeApp("chrome", "https://www.linkedin.com/");
	//	loginLinkedIn("mdhussain16@gmail.com", "chennai63");
		clickByLinkText("Profile");
		String data1="selenium";
		Thread.sleep(5000);
		List<WebElement> skills= findAllElementsByXPath("//*[@id='profile-skills'] ");
		 int size = skills.size();
		 System.out.println(size);
		String result = "false";
		
		//label1:
		/*
		for (WebElement webElement1 : skills)
		{
			System.out.println(webElement1);
			if(webElement1.equals(data1))
			{
				result ="true";
				System.out.println("skill already exist");
				break;
			}
			
			
		}*/
		
		
		if(result.equalsIgnoreCase("false"))
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
