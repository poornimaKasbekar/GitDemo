package Package;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FlipKartObjects;
import resources.Base;

public class FlipkartTest extends Base {
	public   WebDriver driver;
   public	FlipKartObjects f;
  
	
	@BeforeTest
	public void navigate() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void flipkart() throws InterruptedException
	{
		 f=new FlipKartObjects(driver);
		
	f.getcancelLogin().click();
		f.getSearch().sendKeys("winter heater");
		f.getclickserachbutton().click();
		f.getproduct().click();
		Set<String> ids=driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		
		String parentId=it.next();
		
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.getTitle());
		f.getaddToCart().click();
		driver.switchTo().window(parentId);
		//Thread.sleep(5000);
		f.getClickCart().click();
		String expected=f.getProductverify().getText();
		System.out.println(expected);
		Assert.assertEquals("Hari handy heater machine Mahima Corporation Winter Por...", expected);
		System.out.println("validated successfully");
		
		
	}
	@AfterTest
	public void quit()
	{
		driver.close();
	}
	
	

}