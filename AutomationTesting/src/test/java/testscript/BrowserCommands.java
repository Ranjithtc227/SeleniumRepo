package testscript;

public class BrowserCommands extends Base{

	
		
		public void browserCommands()
		{
			//String title=driver.getTitle();
			//System.out.println(title);
			//String url=driver.getCurrentUrl();
			//System.out.println(url);
			String pagesourse=driver.getPageSource();
			System.out.println(pagesourse);
		}
		public static void main(String[] args)
		{
			 BrowserCommands browserCommands=new BrowserCommands();
			 browserCommands.browserInitialisation();
			 browserCommands.browserCommands();
			 browserCommands.driverQuit();
		}
		
	}


