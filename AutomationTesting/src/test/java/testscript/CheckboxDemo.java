package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemo extends Base{

	public void testCheckboxDemo()
	{
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement elementlinktext1=driver.findElement(By.linkText("Checkbox Demo"));
		elementlinktext1.click();
		
		WebElement element1=driver.findElement(By.id("gridCheck"));
		element1.click();
		
		WebElement element2=driver.findElement(By.id("button-two"));
		element2.click();

		WebElement element3=driver.findElement(By.id("button-two"));
		element3.click();


	}
	public void checkBoxTest()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
  if(checkbox.isSelected())
  {
	  System.out.println("Checkbox is selected");
  }
  else
  {
	  System.out.println("Checkbox is not selected");
	  checkbox.click();
  }
	}
	public static void main(String[] args) {
		
		CheckboxDemo checkboxdemo=new CheckboxDemo();
		checkboxdemo.browserInitialisation();
		//checkboxdemo.testCheckboxDemo();
		checkboxdemo.checkBoxTest();
	}

}
