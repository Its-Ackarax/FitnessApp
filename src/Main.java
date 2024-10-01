public class Main 
{
	
	public static void main(String[] args)
	{
		MenuSystem menu = new MenuSystem();
		
		try
		{
			//Kickstarting the menu loop
			menu.MenuStart();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
