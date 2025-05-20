package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base
{
    public void dropDown()
    {
    	driver.navigate().to("https://selenium.qabible.in/select-input.php");
    	WebElement dropdown=driver.findElement(By.id("single-input-field"));  
        Select sc=new Select(dropdown);
        //sc.selectByVisibleText("Red");
        //sc.selectByValue("Yellow");
          sc.selectByIndex(3);
    } 
    
	public static void main(String[] args) {
		DropDownHandling dropdownhandling=new DropDownHandling();
		dropdownhandling.browserInitialisation();
		dropdownhandling.dropDown();
	}

}
