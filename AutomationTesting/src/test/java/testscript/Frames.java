package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base {

	public void frame()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']")); 
		driver.switchTo().frame(iframe);
        WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));  
		jmeter.click();
		
		
		
	}
	public static void main(String[] args) {
		
		Frames frames=new Frames();
		frames.browserInitialisation();
		frames.frame();
	}

}
