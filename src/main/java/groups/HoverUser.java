package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverUser {

	@Test
	public void mouseoveruser()
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Users\\Hussain\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
       driver.get("https://the-internet.herokuapp.com/hovers");
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//div[@class='example']/div[2]"))).build().perform();
        if (driver.findElement(By.xpath("//div[@class='example']/div[2]/div[1]/h5")).isDisplayed())
        {
        String value = driver.findElement(By.xpath("//div[@class='example']/div[2]/div[1]/h5")).getText();
        System.out.println(value);
        }
        else
        System.out.println("rollover the mouse to that place");
        //System.out.println(value);
        
		
	}
}
