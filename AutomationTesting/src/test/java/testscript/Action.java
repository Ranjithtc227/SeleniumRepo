package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends Base {

	public void action()
	{
		 driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		 WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		 WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
         Actions actions=new Actions(driver);
        // actions.dragAndDrop(drag1, drop).build().perform();
        // actions.contextClick(drop).build().perform();
        // actions.moveToElement(drag1).build().perform();
        // actions.click(drag1).build().perform();
         actions.doubleClick(drag1).build().perform();
	}
	public static void main(String[] args) 
	{
		Action action=new Action();
		action.browserInitialisation();
		action.action();
	}

}
