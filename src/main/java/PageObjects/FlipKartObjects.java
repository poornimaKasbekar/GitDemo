package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipKartObjects {
	public WebDriver driver;

	By search=By.xpath("//input[@name='q']");
	By product=By.xpath("//a[contains(text(),'Hari handy heater machine Mahima Corporation Winter Por...')]");
	By addToCart=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
	By clickCart=By.xpath("//span[text()='Cart']");
	By productverify=By.xpath("//a[contains(text(),'Hari handy heater machine Mahima Corporation Winte')]");
	By clickSearchButton=By.xpath("//button[@class='L0Z3Pu']");
	
	By cancelLogin=By.xpath("//button[@class='_2KpZ6l _2doB4z']");

	public FlipKartObjects(WebDriver driver) {
		this.driver=driver;
	// TODO Auto-generated constructor stub
}
	public WebElement getSearch()
	{
		return(driver.findElement(search));
		
	}
	
	public WebElement getproduct()
	{
		return(driver.findElement(product));
		
	}
	public WebElement getaddToCart()
	{
		return(driver.findElement(addToCart));
		
	}
	public WebElement getClickCart()
	{
		return(driver.findElement(clickCart));
		
	}
	public WebElement getProductverify()
	{
		return(driver.findElement(productverify));
	}
	
	public WebElement getclickserachbutton()
	{
		return(driver.findElement(clickSearchButton));
	}
	
	public WebElement getcancelLogin()
	{
		return(driver.findElement(cancelLogin));
		
	}
}
