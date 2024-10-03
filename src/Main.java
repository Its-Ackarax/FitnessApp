public class Main 
{
	
	public static void main(String[] args)
	{
		MenuSystem menu = new MenuSystem();
		InformationGather info = new InformationGather();
		
		try
		{
			info.InfoGather();
			User user = new User(info.userAge, info.userGender, info.userHeightInCM, info.userWeightInKG, info.userActivityLevel);
			
			//Kickstarting the menu loop
			menu.MenuStart();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
