package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPath extends Base
{
    public void relativeXPath()
    {
    	/*                   Syntax-    //tag[@attribute='value']                          */
    	
    	WebElement element1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	WebElement element2=driver.findElement(By.xpath("//input[@id='value-a']"));
    	WebElement element3=driver.findElement(By.xpath("//input[@id='value-b']"));
    	WebElement element4=driver.findElement(By.xpath("//input[@id='gridCheck']"));
    	WebElement element5=driver.findElement(By.xpath("//input[@id='check-box-one']"));
    }
    
    public void text()
    {
    	/*                   Syntax-    //tag[text()='text']                          */
    	
    	WebElement element1=driver.findElement(By.xpath("//button[text()='Show Message']"));
    	WebElement element2=driver.findElement(By.xpath("//button[text()='Get Total']"));
    	WebElement element3=driver.findElement(By.xpath("//button[text()='Get First Selected']"));
    	WebElement element4=driver.findElement(By.xpath("//button[text()='Get All Selected']"));
    	WebElement element5=driver.findElement(By.xpath("//button[text()='Get Results']"));
    }
    
    public void contains()
    {
    	/*                 //tag[contains(@attribute,'value')]                              */
        
    	WebElement element1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
    	WebElement element2=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
    	WebElement element3=driver.findElement(By.xpath(""));

    }
    
    public void startsWith()
    {
    	/*                     //tag[starts-with(@attribute,'value')]                         */
    	
    	WebElement element1=driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
    	WebElement element2=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
    	WebElement element3=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));


    }
    
    public void and()
    {
    	
    	/*                     //tag[@attribute='value' and @attribute='value']                                 */
    	
    	WebElement element1=driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
    	WebElement element2=driver.findElement(By.xpath("//input[@class='form-control datepicker' and @type='text']"));

    }
    
    public void or()
    {
    	/*                  //tag[@attribute='value' or @attribute='value']                                  */
    	
    	WebElement element1=driver.findElement(By.xpath("//input[@placeholder='Message' or @id='single-input-field']"));
    	WebElement element2=driver.findElement(By.xpath("//span[@id='inputGroupPrepend' or @class='input-group-text']"));
    	WebElement element3=driver.findElement(By.xpath("//input[@id='invalidCheck' or @class='form-check-input']"));

    }
    
	public static void main(String[] args)
	{
		XPath xpath=new XPath();

	}

}
