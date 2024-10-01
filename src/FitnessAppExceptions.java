public class FitnessAppExceptions extends Exception
{
	//Created a custom exception to print a custom message for the user inputs breaking the menu
    public FitnessAppExceptions() 
    {
    	super("You must enter one of the numbers specified in the menu.");
    }

    public FitnessAppExceptions(String userInput)
    {
       super("You entered " + userInput + " which is not one of the numbers specified in the menu. Please try again.");
    }
}
