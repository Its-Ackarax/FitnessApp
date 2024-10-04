import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateUserInfo 
{
	User user = User.getInstance();

	//MenuSystem menu = new MenuSystem();

	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	boolean mainLoop = true;

	int choice;
	String userChoiceInput;
	String menuReturn;
	
	int updatedAge;
	String updatedGender;
	int updatedHeight;
	double updatedWeight;
	int updatedActivityLevel;
	
	public void UpdateInfo()
	{
		
		
		//***********************************************************
		
		try
		{
			//Menu Loop
			while(true)
			{
		        System.out.println("Updating Information Menu.\n");
		        System.out.print("1.) Age. \n");
		        System.out.print("2.) Gender.\n");
		        System.out.print("3.) Height.\n");
		        System.out.print("4.) Weight.\n");
		        System.out.print("5.) Activity Level.\n");
		        System.out.print("6.) Return\n");
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
				        //Update age
						System.out.println("Please enter your current age: ");
						updatedAge = Integer.parseInt(in.readLine());
						user.setAge(updatedAge);
						System.out.println("You have changed your 'Age' to: " + user.getAge());

						
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
						
				        break;
	
						//******************************************************************************************

				    case 2: 
				        //Update gender
						System.out.println("Please enter your gender. 'M' for Male 'F' for Female:");
						updatedGender = in.readLine();
						user.setGender(updatedGender);
						System.out.println("You have changed your 'Gender' to: " + user.getGender());

						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
						
				        break;
	
						//******************************************************************************************

				    case 3:
				        //Update height
						System.out.println("Please enter your height in 'Centimeters:");
						updatedHeight = Integer.parseInt(in.readLine());
						user.setHeightInCM(updatedHeight);
						System.out.println("You have changed your 'Height' to: " + user.getHeightInCM());

						
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
	
				        break;
	
						//******************************************************************************************

				    case 4: 
				        //Update weight
						System.out.println("Please enter your weight in 'KG's:");
						updatedWeight = Double.parseDouble(in.readLine());
						user.setWeightInKG(updatedWeight);
						System.out.println("You have changed your 'Weight' to: " + user.getWeightInKG());

						
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();
				        break;
	
						//******************************************************************************************

				    case 5:
				        //Update fitness level
						System.out.println("Please enter the number that best corresponds to your 'Activity level':");
						System.out.println("Enter '1' if 'Not Active'.");
						System.out.println("Enter '2' if 'Slightly Active'.");
						System.out.println("Enter '3' if 'Moderately Active'.");
						System.out.println("Enter '4' if 'Very Active'.");
						System.out.println("Enter '5' if 'Vigorously Active'.");
						System.out.println("Enter '6' if 'Extreamely Active'.");
						System.out.println("Enter your number now:");
				    		
						updatedActivityLevel = Integer.parseInt(in.readLine());
						user.setActivityLevel(updatedActivityLevel);
						System.out.println("You have changed your 'Activity Level' to: " + user.getActivityLevel());
						
						System.out.println("Enter anything to return to the menu.");
						menuReturn = in.readLine();

				        break;
	
						//******************************************************************************************

				    case 6: 
				        System.out.println("Returning to main menu...");
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
			UpdateInfo();
		} 
		
	}
}
