package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonsDemo extends Base{

	public void testRadioButtonsDemo()
	{
    	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement element1=driver.findElement(By.id("inlineRadio1"));
		element1.click();
		
		WebElement element2=driver.findElement(By.id("button-one"));
		element2.click();
	
		WebElement element3=driver.findElement(By.cssSelector("input#inlineRadio2"));  
		element3.click();
		
		WebElement element4=driver.findElement(By.id("button-one"));
		element4.click();
    	
	}
	
	public void testGroupRadioButtons()
	{
    	
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		//Male
    	WebElement element1=driver.findElement(By.id("inlineRadio11"));
		element1.click();
		
		WebElement element3=driver.findElement(By.cssSelector("input#inlineRadio22"));  
		element3.click();
		

		WebElement element4=driver.findElement(By.cssSelector("button#button-two"));  
		element4.click();
		
		WebElement element5=driver.findElement(By.cssSelector("input#inlineRadio23"));  
		element5.click();
		
		WebElement element6=driver.findElement(By.cssSelector("button#button-two"));  
		element6.click();
		
		WebElement element7=driver.findElement(By.cssSelector("input#inlineRadio24"));  
		element7.click();
		
		WebElement element8=driver.findElement(By.cssSelector("button#button-two"));  
		element8.click();
		
		//Female

		WebElement element9=driver.findElement(By.cssSelector("input#inlineRadio21"));  
		element9.click();
		
		WebElement element10=driver.findElement(By.cssSelector("input#inlineRadio22"));  
		element10.click();
		
		
		WebElement element11=driver.findElement(By.cssSelector("input#inlineRadio23"));  
		element11.click();
		
		WebElement element12=driver.findElement(By.cssSelector("input#inlineRadio24"));  
		element12.click();
		
		WebElement element13=driver.findElement(By.cssSelector("button#button-two"));  
		element13.click();
		
		
	}
	
	public void testRadioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));  
		//radiobutton.click();
		if(radiobutton.isSelected())
		  {
			  System.out.println("RadioButton is selected");
		  }
		  else
		  {
			  System.out.println("RadioButton is not selected");
			  radiobutton.click();
		  }
        
	}
	public static void main(String[] args) {
		
		RadioButtonsDemo radiobuttonsdemo=new RadioButtonsDemo();
		radiobuttonsdemo.browserInitialisation();
		//radiobuttonsdemo.testRadioButtonsDemo();
		//radiobuttonsdemo.testGroupRadioButtons();
		radiobuttonsdemo.testRadioButton();
	}

}
