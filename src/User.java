
public class User 
{
	
	private static User instance;
	
	static int age;
	static String gender;
	static int heightInCM;
	static double weightInKG;
	static int activityLevel;
	
	static int userDailyProteinLower;
	static int userDailyProteinUpper;
	
	static double userBMI = 0;
	static int userBMR = 0;
	static double userMaintenenceCalorieCount = 0;
	static double userBodyFat = 0;
	/*
	static int userNeckWidth = 0;
	static int userWaistWidth = 0;
	*/
	
	//******************************************************************************************
	// Constructor Declaration of Class
	
	public User(int age, String gender, int heightInCM, double weightInKG,int activityLevel)
	{
		this.age = age;
		this.gender = gender;
		this.heightInCM = heightInCM;
		this.weightInKG = weightInKG;
		this.activityLevel = activityLevel;
	}

	//******************************************************************************************
	//Establishing getter methods for the user's initial information.
	
	public static User getInstance()
	{
		if (instance == null) 
		{
            instance = new User(getAge(), getGender(), getHeightInCM(), getWeightInKG(), getActivityLevel());
        }
        return instance;	
    }
	
	//Age
	public static int getAge() 
	{ 
		return age; 
	}
	
	public static void setAge(int updatedAge)
	{
		age = updatedAge;
	}
	
	
    //Gender
	public static String getGender() 
	{ 
		return gender; 
	}
	
	public static void setGender(String updatedGender)
	{
		gender = updatedGender;
	}

	
    //Height
	public static int getHeightInCM() 
	{ 
		return heightInCM; 
	}
	
	public static void setHeightInCM(int updatedHeight)
	{
		heightInCM = updatedHeight;
	}

	
    //Weight
	public static double getWeightInKG() 
	{ 
		return weightInKG; 
	}
	
	public static void setWeightInKG(double updatedWeight)
	{
		weightInKG = updatedWeight;
	}
	
	
	//ActivityLevel
	public static int getActivityLevel() 
	{ 
		return activityLevel; 
	}
	
	public static void setActivityLevel(int updatedActivityLevel)
	{
		activityLevel = updatedActivityLevel;
	}
	
	//******************************************************************************************
	//Getters and Setters for the new and calculated user information
	
	
	//BMI
	public static double getUserBMI()
	{
		return userBMI;
	}
	
	public static void setUserBMI(double calculatedBMI)
	{
		userBMI = calculatedBMI;
	}
	
	
	//BMR
	public static double getUserBMR()
	{
		return userBMR;
	}
	
	public static void setUserBMR(double calculatedBMR)
	{
		userBMI = calculatedBMR;
	}
	
	
	//MaintenanceCalories
	public static double getMaintenenceCalorieCount()
	{
		return userBMI;
	}
	
	public static void setMaintenenceCalorieCount(double calculatedMaintenenceCalorieCount)
	{
		userBMI = calculatedMaintenenceCalorieCount;
	}
	
	
	//BodyFat
	public static double getUserBodyFat()
	{
		return userBodyFat;
	}
	
	public static void setUserBodyFat(double calculatedBodyFat)
	{
		userBodyFat = calculatedBodyFat;
	}
}
