import java.io.DataInputStream;
	
public class BodyMassIndexCalc 
{
	User user = User.getInstance();
	
	DataInputStream in = new DataInputStream(System.in);

	double resultBMI = 0.0;
	double userHeightConverted = 0.0;
	double heightSquared = 0.0;
	
	String resultPara = "According to the 'World Health Organisation', you fall into their classification of ";
	String menuReturn = "";

	
	public void BMICalc()
	{
		
		//******************************************************************************************
		//Using user info to calculate the user's BMI
		try
		{
			userHeightConverted = (double)user.getHeightInCM() / 100;
			heightSquared = userHeightConverted * userHeightConverted;
			
			resultBMI = user.getWeightInKG() / heightSquared;
			user.setUserBMI(resultBMI);

		}
		catch(Exception e)
		{
			
		}
		
	}
	
	public void displayBMI()
	{
		if (resultBMI > 40.0)
		{
			resultPara = resultPara + "'Obese Class III' ";	
		}
		else if (resultBMI > 35.0)
		{
			resultPara = resultPara +  "'Obese Class II' ";	
		}
		else if (resultBMI > 30.0)
		{
			resultPara = resultPara +  "'Obese Class I' ";	
		}
		else if (resultBMI > 25.0)
		{
			resultPara = resultPara +  "'Overweight' ";	
		}
		else if (resultBMI > 18.5)
		{
			resultPara = resultPara +  "'Normal' ";	
		}
		else if (resultBMI > 17.0)
		{
			resultPara = resultPara +  "'Mild Thinness' ";	
		}
		else if (resultBMI > 16.0)
		{
			resultPara = resultPara +  "'Moderate Thinness' ";	
		}
		else
		{
			resultPara = resultPara +  "'Severe Thinness' ";	
		}
					
		System.out.println(resultPara + "as your BMI is " + resultBMI + ".");
		
		//******************************************************************************************

	}
}
