package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{

	public void addition()
	{
    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
    	
    	
		WebElement element3=driver.findElement(By.id("value-a"));
        element3.sendKeys("5");
		WebElement element4=driver.findElement(By.id("value-b"));
		element4.sendKeys("10");
		WebElement element5=driver.findElement(By.id("button-two"));
		element5.click();
		
	}
	public static void main(String[] args)
	{
		TestSample testsample=new TestSample();
		testsample.browserInitialisation();
		testsample.addition();
	}

}
