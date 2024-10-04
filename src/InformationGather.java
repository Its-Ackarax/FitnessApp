import java.io.DataInputStream;

public class InformationGather 
{
	
	DataInputStream in = new DataInputStream(System.in);

	int userAge = 0;
	String userGender = "";
	int userHeightInCM = 0;
	double userWeightInKG = 0.0;
	int userActivityLevel = 0;
	public void InfoGather()
	{
		
		//******************************************************************************************
		//Gathering user information
		try
		{
			System.out.println("Before we begin I need to gather some information from you.");
			System.out.println("Please enter your 'Age':");
			userAge = Integer.parseInt(in.readLine());
			
			System.out.println("Please enter your 'Gender'. 'M' for Male 'F' for Female:");
			userGender = in.readLine();
			
			System.out.println("Please enter your 'Height' in 'Centimeters:");
			userHeightInCM = Integer.parseInt(in.readLine());
			
			System.out.println("Please enter your 'Weight' in 'KG's:");
			userWeightInKG = Double.parseDouble(in.readLine());
			
			System.out.println("Please enter the number that best corresponds to your 'Activity Level':");
			System.out.println("Enter '1' if 'Not Active'.");
			System.out.println("Enter '2' if 'Slightly Active'.");
			System.out.println("Enter '3' if 'Moderately Active'.");
			System.out.println("Enter '4' if 'Very Active'.");
			System.out.println("Enter '5' if 'Vigorously Active'.");
			System.out.println("Enter '6' if 'Extreamely Active'.");
			System.out.println("Enter your number now:");
			userActivityLevel = Integer.parseInt(in.readLine());

		}
		catch(Exception e)
		{
			
		}
	}
}
