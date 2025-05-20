package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base

{
   public void tablePrinting()
   {
	   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	   WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));  
       System.out.println(element.getText());
       
   }
   
   public void row()
   {
	   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	   //WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	   WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]"));

	   System.out.println(element.getText());
   }
   
   public void cell()
   {
	   driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	  
	  // WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
	   WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[2]"));

	   System.out.println(element.getText());
   }
	
	public static void main(String[] args) 
	{
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserInitialisation();
		//tablehandling.tablePrinting();
		tablehandling.row();
		//tablehandling.cell();
		
	}
	

}
