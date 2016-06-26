package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SortItems {
	@Test
	public void sortitem()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Users\\Hussain\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
       driver.get("http://jqueryui.com/sortable/");
       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
       Actions builder = new Actions(driver);
       builder.clickAndHold(driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"))).pause(3000).moveToElement(driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"))).build().perform();
       builder.release(driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"))).build().perform();
	}
	
}
