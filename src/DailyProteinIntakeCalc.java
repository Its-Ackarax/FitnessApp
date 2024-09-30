public class DailyProteinIntakeCalc 
{
	User user = User.getInstance();
	
	//******************************************************************************************

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
