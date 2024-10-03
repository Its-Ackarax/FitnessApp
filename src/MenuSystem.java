import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MenuSystem 
{
	//***********************************************************

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	BodyMassIndexCalc bmi = new BodyMassIndexCalc();
	DailyCalorieCalc calories = new DailyCalorieCalc();
	DailyProteinIntakeCalc protein = new DailyProteinIntakeCalc();
	BodyFatCalc fat = new BodyFatCalc();
	
	//***********************************************************
	
	public void MenuStart()
	{
		boolean mainLoop = true;

		int choice;
		String userChoiceInput;
		String menuReturn;
		
		//***********************************************************
		
		try
		{
			//Menu Loop
			while(true)
			{
		        System.out.println("Fitness Calculator Main Menu\n");
		        System.out.print("1.) Update/Change your information \n");
		        System.out.print("2.) Body Mass Index (BMI) Calculator.\n");
		        System.out.print("3.) Daily Calorie Calculator.\n");
		        System.out.print("4.) Daily Protein Intake Calculator.\n");
		        System.out.print("5.) Body Fat Calculator.\n");
		        System.out.print("6.) Exit\n");
		        System.out.print("\nEnter Your Menu Choice: ");

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
				        //User enters their information
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
						
				        break;
	
						//******************************************************************************************

				    case 2: 
				    	//Body Mass Index Calculator
				    	bmi.BMICalc();
				    	bmi.displayBMI();
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
						
				        break;
	
						//******************************************************************************************

				    case 3:
				    	//Daily Calorie Calculator
						calories.getMaintenanceCalc();
	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
	
				        break;
	
						//******************************************************************************************

				    case 4: 
				        //Daily Protein Intake Calculator
				    	protein.getDailyProteinIntake();
				    					    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
				        break;
	
						//******************************************************************************************

				    case 5:
				        //Body Fat Calculator
				    	fat.getBodyFat();
				    					    	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 6: 
				        System.out.println("Exiting Program...");
				        System.exit(0);
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
			MenuStart();
		} 
		
	}
}
