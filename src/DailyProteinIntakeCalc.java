public class DailyProteinIntakeCalc 
{
	User user = User.getInstance();
	
	//******************************************************************************************
	//Using user info to calculate the estimated range for how much protein the user should intake daily.

	public void getDailyProteinIntake()
	{
		int lowerProteinIntake = 0;
		int higherProteinIntake = 0;
		
		lowerProteinIntake = (int)(user.weightInKG * 1.2);
		higherProteinIntake = (int)(user.weightInKG * 2.0);
		
		System.out.println("Your daily protein intake should be between " + lowerProteinIntake + " gram's, and " + higherProteinIntake + " gram'1s.");
	}
	
	//******************************************************************************************

}
