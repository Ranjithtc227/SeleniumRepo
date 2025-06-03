package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
  
	public void id()//method to illustrate locator id 
   {
	   driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	 
	   /* Syntax---  WebElement elementname=driver.findElement(By.locator("locatorvalue")); */
	   
	   WebElement entermessage=driver.findElement(By.id("single-input-field"));
	   entermessage.sendKeys("Test");
	   
	   WebElement showmsg=driver.findElement(By.id("button-one"));
	   showmsg.click(); 
	   
	   WebElement elementid1=driver.findElement(By.id("value-a"));
	   WebElement elementid2=driver.findElement(By.id("value-b"));
	   WebElement elementid3=driver.findElement(By.id("from"));
   }
	public void className()
	{
		 WebElement enterdate=driver.findElement(By.className("form-control datepicker"));
		 WebElement elementclassname2=driver.findElement(By.className("ui-datepicker-month"));
		 WebElement elementclassname3=driver.findElement(By.className("btn moveall btn-outline-secondary"));

	}
	public void name()
	{
		 WebElement elementname1=driver.findElement(By.name("description"));
		 WebElement elementname2=driver.findElement(By.name("viewport"));
		 WebElement elementname3=driver.findElement(By.name("author"));

	}
	public void linkText()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement ajaxformsubmit=driver.findElement(By.linkText("Ajax Form Submit"));
		ajaxformsubmit.click();
		
		//WebElement elementlinktext1=driver.findElement(By.linkText("Radio Buttons Demo"));
		//WebElement elementlinktext3=driver.findElement(By.linkText("Checkbox Demo"));

	}
	public void partialLinkText()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
        WebElement radiobuttondemo=driver.findElement(By.partialLinkText("Radio Buttons"));
		radiobuttondemo.click();
		
		//WebElement elementpartiallinktext2=driver.findElement(By.partialLinkText("Form Submit"));
		//WebElement elementpartiallinktext3=driver.findElement(By.partialLinkText("Checkbox"));

	}
	public static void main(String[] args) 
	{
		
		Locators locators=new Locators();
		locators.browserInitialisation();
		//locators.id();
		//locators.name();
		//locators.className();
		//locators.linkText();
		locators.partialLinkText();
		//locators.driverQuit();
	}

}
