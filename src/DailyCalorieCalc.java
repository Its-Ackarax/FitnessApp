
public class DailyCalorieCalc 
{
	double userWeight = 0.0;
	int userHeight = 0;
	String userGender = "";
	int userAge = 0;
	
	private int BMRCalc()
	{
		
		int basalMetabolicRate;
		
		if (userGender == "M")
		{
			basalMetabolicRate = (int) Math.round(10 * userWeight + 6.25 * userHeight - 5 * userAge + 5);
		}
		else if (userGender == "F");
		{
			basalMetabolicRate = (int) Math.round(10 * userWeight + 6.25 * userHeight - 5 * userAge - 161);
		}
		return basalMetabolicRate;
	}
	
	private double getActivityLevelNumber(int userActivityLevel)
	{
		double activityLevelNumber = 0;
		
		switch(userActivityLevel)
		{
			case 1:
				//Not Active
				activityLevelNumber = 1.55;
			break;
			
			case 2:
				//Slightly Active
				activityLevelNumber = 1.70;
				
			break;
			
			case 3:
				//Moderately Active
				activityLevelNumber = 1.85;
				
			break;
			
			case 4:
				//Very Active
				activityLevelNumber = 2.025;
				
			break;
			
			case 5:
				// Vigorously Active
				activityLevelNumber = 2.2;
				
			break;
			
			case 6:
				//Extremely Active
				activityLevelNumber = 2.4;
				
			break;
		}
 
		return activityLevelNumber;
	}
	private double MaintenanceCalc(int bmr, double userActivityLevel)
	{
		
		double maintenenceResult = bmr * userActivityLevel;
		return maintenenceResult;
	}
}
