package groups;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wrappers.*;


public class TestCase_05 extends LinkedInWrappers
{
	@Test(groups="profile",dependsOnGroups ="advancedsearch")
	public void execute_05() throws InterruptedException, MalformedURLException
	{
		
		invokeApp("chrome", "https://www.linkedin.com/");
		loginLinkedIn("mdhussain16@gmail.com", "chennai63");
		clickById("advanced-search");
		Thread.sleep(5000);
	//	WebElement element = driver.findElement(By.linkText("Import and Export"));
	//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
		clickByXPath("//*[@id='peopleSearchForm']/fieldset/ol/li[9]/div/span");
		
		Thread.sleep(5000);
		selectByIDByValue("advs-locationType","I");
		Thread.sleep(10000);
		selectByIDByVisbleText("advs-countryCode", "India");
		Thread.sleep(10000);
		clickByXPath("//*[@id='peopleSearchForm']/div[1]/input[2]");
		Thread.sleep(5000);
		String resetvalue = getTextByXPath("//*[@id='advs-company']");
		
		System.out.println(resetvalue);
		if(resetvalue.equalsIgnoreCase(null))
			System.out.println(" company textfield is empty");
		clickById("adv-F-N-ffs");
		clickByClassName("submit-advs");
		

	}

	
}
