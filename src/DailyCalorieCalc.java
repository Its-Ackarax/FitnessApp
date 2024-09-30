
public class DailyCalorieCalc 
{
	User user = User.getInstance();
	
	//******************************************************************************************

	public int getBMR()
	{
		
		int basalMetabolicRate;
		
		if (user.getGender() == "M")
		{
			basalMetabolicRate = (int) Math.round((10 * user.getWeightInKG()) + (6.25 * user.getHeightInCM()) - (5 * user.getAge() + 5));
		}
		else if (user.getGender() == "F");
		{
			basalMetabolicRate = (int) Math.round(10 * user.getWeightInKG() + 6.25 * user.getHeightInCM() - 5 * user.getAge() - 161);
		}
		return basalMetabolicRate;
	}
	
	//******************************************************************************************
	
	public double getActivityLevelNumber(int userActivityLevel)
	{
		double activityLevelNumber = 0;
		
		switch(userActivityLevel)
		{
			case 1:
				//Not Active
				activityLevelNumber = 1.150;
			break;
			
			case 2:
				//Slightly Active
				activityLevelNumber = 1.30;
				
			break;
			
			case 3:
				//Moderately Active
				activityLevelNumber = 1.50;
				
			break;
			
			case 4:
				//Vigorously Active
				activityLevelNumber = 1.65;
				
			break;
			
			case 5:
				//Extremely Active
				activityLevelNumber = 1.85;
				
			break;
			
			case 6:
				//Insanely Active
				activityLevelNumber = 2.1;
				
			break;
		}
 
		return activityLevelNumber;
	}
	
	//******************************************************************************************
	
	public void getMaintenanceCalc()
	{
		
		double maintenenceResult = getBMR() * getActivityLevelNumber(user.getActivityLevel());
		System.out.println(maintenenceResult);
	}
	
	//******************************************************************************************

}
