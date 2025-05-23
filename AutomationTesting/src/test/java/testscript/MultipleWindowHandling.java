package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{

	public void multipleWindowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()=\'CONTACT US\']")); 
		contactus.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()=\'LOGIN PORTAL\']")); 
        login.click();
        String parenthandle=driver.getWindowHandle();
        System.out.println(parenthandle);
        System.out.println("* * * * * * * * * * * * * * * * *");
        Set<String> childhandle=driver.getWindowHandles();
        for(String set:childhandle)
        {
        	System.out.println("Window Handle"+set);
        	driver.switchTo().window(set);
        	System.out.println(driver.getTitle());
        	System.out.println(driver.getCurrentUrl());
        	System.out.println("* * * * * * * * * * * * * * * * *");
        }
	}
	public static void main(String[] args) {
		
		MultipleWindowHandling mwhandling=new MultipleWindowHandling();
		mwhandling.browserInitialisation();
		mwhandling.multipleWindowHandling();
	}

}
