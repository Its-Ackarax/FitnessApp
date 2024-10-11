import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DailyCalorieCalc 
{
	User user = User.getInstance();	
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	
	Boolean menuExit = false;
	String menuReturn;
	
	String userChoiceInput;
	int choice;
	
	int requiredDailyCalories;

	public void dailyCaloriesMenu()
	{
		//***********************************************************
		
		try
		{
			//Menu Loop
			while(menuExit == false)
			{
		        System.out.println("What Are Your Goals For Your Weight?");
		        System.out.print("1.) Lose 1kg a week. \n");
		        System.out.print("2.) Lose 0.5kg's a week.\n");
		        System.out.print("3.) Maintain weight.\n");
		        System.out.print("4.) Gain 0.5kg's a week.\n");
		        System.out.print("5.) Gain 1kg a week.\n");
		        System.out.print("6.) Return\n");
		        System.out.print("\nEnter Your Choice: ");

		        userChoiceInput = in.readLine();
		        
				//***********************************************************
		        //User input error handling in case the user's input breaks the menu.
		        
		        try
		        {
		        	choice = Integer.parseInt(userChoiceInput);
		        }
		        catch(Exception e)
		        {
		        	throw new FitnessAppExceptions(userChoiceInput); 
		        }
		        	
				//***********************************************************
		        //Switch case to trigger different menu functions depending on user input
		        
			    switch(choice)
			    {
			    
				    case 1:
				        //Lose 1kg a week
				    	requiredDailyCalories = (int) getMaintenanceCalc();
				    	requiredDailyCalories = requiredDailyCalories - 1000;
				    	System.out.println("Your recommended daily calories to lose 1kg a week is '" + requiredDailyCalories + "' calories.");
				    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 2: 
				        //Lose 0.5kg a week
				    	requiredDailyCalories = (int) getMaintenanceCalc();
				    	requiredDailyCalories = requiredDailyCalories - 500;
				    	System.out.println("Your recommended daily calories to lose 0.5kgs a week is '" + requiredDailyCalories + "' calories.");
				    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 3:
				        //Maintenance Calc
				    	requiredDailyCalories = (int) getMaintenanceCalc();
				    	System.out.println("Your recommended daily calories to maintain weight is '" + requiredDailyCalories + "' calories.");
				    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 4: 
				        //Gain 0.5kg a week
				    	requiredDailyCalories = (int) getMaintenanceCalc();
				    	requiredDailyCalories = requiredDailyCalories + 500;
				    	System.out.println("Your recommended daily calories to gain 0.5kg a week is '" + requiredDailyCalories + "' calories.");
				    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 5:
				        //Gain 1kg a week
				    	requiredDailyCalories = (int) getMaintenanceCalc();
				    	requiredDailyCalories = requiredDailyCalories + 1000;
				    	System.out.println("Your recommended daily calories to gain 1kg a week is '" + requiredDailyCalories + "' calories.");
				    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 6: 
				        System.out.println("Returning to main menu...");
				        menuExit = true;
				         break;
				         
				    default :
				             System.out.println("This is not a valid Menu Option! Please Select Another");
				             break;
				             
				}
			    
				//******************************************************************************************

			}
		}
		//Catch to restart the menu after user triggers any error handling exceptions
		catch (Exception e)
		{
			e.printStackTrace();
			dailyCaloriesMenu();
		} 
		
	}

	//******************************************************************************************
	//Using user info to calculate the user's BMR (Basal Metabolic Rate)

	public int getBMR()
	{
		
		int basalMetabolicRate = 0;
		
		try 
		{
			if (user.getGender() == "M")
			{
				basalMetabolicRate = (int) Math.round((10 * user.getWeightInKG()) + (6.25 * user.getHeightInCM()) - (5 * user.getAge() + 5));
			}
			else if (user.getGender() == "F");
			{
				basalMetabolicRate = (int) Math.round((10 * user.getWeightInKG() + 6.25 * user.getHeightInCM()) - 5 * user.getAge() - 161);
			}
		}
		catch(Exception e)
		{
			
		}
		user.setUserBMR(basalMetabolicRate);
		
		return basalMetabolicRate;
	}
	
	//******************************************************************************************
	//Using user info to calculate the user's activity level number thats used for getting daily maintenance calories

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
	//Using user info to calculate the estimate for the user's daily calorie maintenance count

	public double getMaintenanceCalc()
	{
		double maintenenceResult = 0.0;
		
		try
		{
			maintenenceResult = getBMR() * getActivityLevelNumber(user.getActivityLevel());
			//System.out.println(maintenenceResult);
		}
		catch(Exception e)
		{
			
		}
		user.setMaintenenceCalorieCount(maintenenceResult);
		
		return maintenenceResult;
	}
	
	//******************************************************************************************

}
