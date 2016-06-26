package testcases;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import wrappers.*;
@Test
public class TestCase_07 extends LinkedInWrappers
{
	public void execute_07 () throws InterruptedException, MalformedURLException
	{
		invokeApp("chrome", "https://www.linkedin.com/");
		loginLinkedIn("mdhussain16@gmail.com", "chennai63");
		clickByXPath("//*[@id='dropdowntest']");
		Thread.sleep(5000);
		String text= getTextByXPath("//*[@id='card-71914632']");
		System.out.println(text);
		/*clickByXPath("//*[@id='card-476595422']/div/div[2]/button[1]"); //*[@id="card-358433106"]/div/div[2]/button[1];//*[@id="card-476595422"]/div/div[2]/button[1]
		//*[@id="card-476595422"]/div/div[2]/button[1]
		Thread.sleep(2000);
		boolean result1 =isVisibleByXPath("//*[@id='dismiss-alert']");
		System.out.println(result1);
		Thread.sleep(5000);
		boolean result= isVisibleByXPath("//*[@id='dismiss-alert']");
		if(result==false)
		System.out.println("text disappeard");*/
		
	}

}
