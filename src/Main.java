
public class Main 
{
	
	public static void main(String[] args) 
	{
		InformationGather info = new InformationGather();
		DailyCalorieCalc calories = new DailyCalorieCalc();
		
		info.InfoGather();
		User user = new User(info.userAge, info.userGender, info.userHeightInCM, info.userWeightInKG, info.userActivityLevel);
		
		
		
		
		BodyMassIndexCalc bmi = new BodyMassIndexCalc();
		bmi.BMICalc();
		calories.getMaintenanceCalc();
		

	}

}
