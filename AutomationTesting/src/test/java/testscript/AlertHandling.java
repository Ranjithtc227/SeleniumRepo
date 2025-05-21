package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{
   public void simple()
   {
	     driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		 WebElement button1=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
         button1.click();
	     driver.switchTo().alert().accept();
   }
   public void confirmation()
   {
	   driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	   WebElement button2=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	   button2.click();
	   driver.switchTo().alert().dismiss();
   }
   public void prompt()
   {
	   driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	   WebElement button3=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	   button3.click();
	   driver.switchTo().alert().sendKeys("Hello Testers");
	   driver.switchTo().alert().accept();
   }
	public static void main(String[] args)
	{
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialisation();
		//alerthandling.simple();
		 //alerthandling.confirmation();
		  alerthandling.prompt();
	}

}
