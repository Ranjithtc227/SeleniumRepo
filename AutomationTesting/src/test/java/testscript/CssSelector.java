package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base
{
	        //1.Tag and ID(tag#id)
			//2.Tag and class(tag.class)
			//3.Tag and Attribute(tag[attribute=value]
		    //4.Tag,class,and Attribute(tag.classname[attribute=value]
	
	public void tagAndId()
	{
		/*                   Syntax-    tag#id                          */
		
		WebElement element1=driver.findElement(By.cssSelector("input#single-input-field"));  
        WebElement element2=driver.findElement(By.cssSelector("button#button-one"));
		WebElement element3=driver.findElement(By.cssSelector("input#value-a"));
		WebElement element4=driver.findElement(By.cssSelector("input#subject"));
		WebElement element5=driver.findElement(By.cssSelector("span#select2-t1c5-container"));
	}
	
	public void tagAndClass()
	{
		/*                   Syntax-    tag.class                         */
		
		WebElement element1=driver.findElement(By.cssSelector("input.form-check-input"));   
		WebElement element2=driver.findElement(By.cssSelector("input.form-control"));
		WebElement element3=driver.findElement(By.cssSelector("span.input-group-text"));
		WebElement element4=driver.findElement(By.cssSelector("span.carousel-control-next-icon"));
		WebElement element5=driver.findElement(By.cssSelector("span.carousel-control-prev-icon"));

	}
	
	public void tagAndAttribute()
	{ 
		/*                   Syntax-    tag[attribute=value]                    */
		
		WebElement element1=driver.findElement(By.cssSelector("button[id='button-one']"));    
		WebElement element2=driver.findElement(By.cssSelector("input[class='form-check-input']"));
		WebElement element3=driver.findElement(By.cssSelector("input[id='subject']"));
		WebElement element4=driver.findElement(By.cssSelector("span[id='select2-t1c5-container']"));
		WebElement element5=driver.findElement(By.cssSelector("input[id='invalidCheck']"));
	}
	
	public void tagClassAndAttribute()
	{
		/*                   Syntax-    tag.classname[attribute=value]                        */
		
		WebElement element1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));  
		WebElement element2=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement element3=driver.findElement(By.cssSelector("input.form-control[id='subject']"));
		WebElement element4=driver.findElement(By.cssSelector("textarea.form-control[id='description']"));
		WebElement element5=driver.findElement(By.cssSelector("input.form-check-input[id='inlineRadio11']"));
	
	}
	
	public static void main(String[] args)
	{
		CssSelector cssselector=new CssSelector();
		

	}

}
