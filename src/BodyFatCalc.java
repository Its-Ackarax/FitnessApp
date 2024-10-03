import java.text.DecimalFormat;

public class BodyFatCalc 
{
	User user = User.getInstance();
	BodyMassIndexCalc bmi = new BodyMassIndexCalc();

	
	double userBodyFat;
	int genderNumber;
	double weightInPounds;
	
	public double convertToPounds()
	{
		weightInPounds = user.getWeightInKG() * 2.2;
		return weightInPounds;
	}
	public void getBodyFat()
	{
		try
		{
			if (user.getGender() == "M")
			{
				genderNumber = 0;
			}
			else if(user.getGender() == "F")
			{
				genderNumber = 1;
			}
			
			if (user.getUserBMI() == 0)
			{
				bmi.BMICalc();
			}
			//******************************************************************************************
			//Equation validated by the 'American Diabetes Association' 
			//which was tested on 6510 people and showed estimated error of 4.66%
			
			userBodyFat = -44.988 + (0.503 * user.getAge()) 
					+ (10.689 * genderNumber) 
					+ (3.172 * user.getUserBMI())
					- (0.026 * Math.pow(user.getUserBMI(), 2))
					+ (0.181 * user.getUserBMI() * genderNumber) 
					- (0.02  * user.getUserBMI() * user.getAge()) 
					- (0.005 * Math.pow(user.getUserBMI(), 2) * genderNumber) 
					+ (0.00021 * Math.pow(user.getUserBMI(), 2) * user.getAge());
			
			userBodyFat = Math.round(userBodyFat * 100.0) / 100.0;
			
			
			//user.setUserBodyFat(userBodyFatRounded);
			System.out.println("Your body fat percentage is estimated to be at " + userBodyFat + "%.");
			
			//******************************************************************************************
		}
		catch(Exception e)
		{
			
		}

	}
}
