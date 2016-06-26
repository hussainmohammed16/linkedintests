package groups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
	
	@Test
	public void dragdrop()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Users\\Hussain\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
        //driver.close();
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Resizable")).click();
       builder.moveByOffset(100, 100).build().perform();
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        builder.contextClick().pause(2000).sendKeys(Keys.DOWN).build().perform();
        builder.sendKeys(Keys.DOWN).build().perform();

        
        
        
	}

}
