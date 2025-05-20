package testscript;

public class NavigationCommands extends Base{
   
	public void navigationCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		
		NavigationCommands navigationCommands=new NavigationCommands();
		navigationCommands.browserInitialisation();
		navigationCommands.navigationCommands();
		navigationCommands.driverQuit();
	}

}
