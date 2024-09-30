import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		InformationGather info = new InformationGather();
		BodyMassIndexCalc bmi = new BodyMassIndexCalc();
		DailyCalorieCalc calories = new DailyCalorieCalc();
		DailyProteinIntakeCalc protein = new DailyProteinIntakeCalc();
		
		/*
		InformationGather info = new InformationGather();
		
		
		
		
		BodyMassIndexCalc bmi = new BodyMassIndexCalc();
		bmi.BMICalc();
		*/
		boolean mainLoop = true;

		int choice;
		int menuReturn;
		
		//***********************************************************
		try
		{
			while(true)
			{
		        System.out.println("Fitness Calculator Main Menu\n");
		        System.out.print("1.) Enter your information \n");
		        System.out.print("2.) Body Mass Index (BMI) Calculator.\n");
		        System.out.print("3.) Daily Calorie Calculator.\n");
		        System.out.print("4.) Daily Protein Intake Calculator.\n");
		        System.out.print("5.) .\n");
		        System.out.print("6.) Exit\n");
		        System.out.print("\nEnter Your Menu Choice: ");

		        choice = input.nextInt();
		        
		        //if (choice != 1 || 2 || 3 || 4 || 5 || 6 )
		        	
			    switch(choice)
			    {
	
				    case 1:
				        //User enters their information
						info.InfoGather();
						User user = new User(info.userAge, info.userGender, info.userHeightInCM, info.userWeightInKG, info.userActivityLevel);
						
						//******************************************************************************************	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = input.nextInt();
						
				        break;
	
				    case 2: 
				    	//Body Mass Index Calculator
				    	bmi.BMICalc();
				    	
						
						//******************************************************************************************	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = input.nextInt();
						
				        break;
	
				    case 3:
				    	//Daily Calorie Calculator
						calories.getMaintenanceCalc();
	
						//******************************************************************************************	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = input.nextInt();
	
				        break;
	
				    case 4: 
				        //Daily Protein Intake Calculator
				    	protein.getDailyProteinIntake();
				    	
						
						//******************************************************************************************	
						System.out.println("Enter anything to return to the menu.");
						menuReturn = input.nextInt();
				        break;
	
				    case 5:
	
				        break;
	
				    case 6: 
				        System.out.println("Exiting Program...");
				        System.exit(0);
				         break;
				    default :
				             System.out.println("This is not a valid Menu Option! Please Select Another");
				             break;
			    }	
				    	    
			}
		}
		
		catch (FitnessAppExceptions ex)
		{
			
		}
	}
}
