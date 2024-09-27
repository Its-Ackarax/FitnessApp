import java.io.DataInputStream;
	
public class BodyMassIndexCalc 
{
	DataInputStream in = new DataInputStream(System.in);
	//Scanner s = new Scanner(System.in);
	
	double resultBMI = 0.0;
	double userWeight= 0.0;
	
	double userHeight = 0.0;
	double heightSquared = 0.0;
	
	String resultPara = "According to the 'World Health Organisation', you fall into their classification of ";
	
	public void BMICalc()
	{
		try
		{
			System.out.println("Please enter your weight in 'KG's:");
			userWeight = Double.parseDouble(in.readLine());
			
			System.out.println("Please enter your height in 'Meter's:");
			userHeight = Double.parseDouble(in.readLine());
			userHeight = userHeight / 100;
			heightSquared = userHeight * userHeight;
			
			resultBMI = userWeight / heightSquared;
			
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
		}
		catch(Exception e)
		{
			
		}
	}
	
}
