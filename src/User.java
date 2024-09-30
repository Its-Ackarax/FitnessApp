
public class User 
{
	
	private static User instance;
	
	static int age;
	static String gender;
	static int heightInCM;
	static double weightInKG;
	static int activityLevel;
	
	// Constructor Declaration of Class
	public User(int Age, String gender, int heightInCM, double weightInKG,int activityLevel)
	{
		this.age = age;
		this.gender = gender;
		this.heightInCM = heightInCM;
		this.weightInKG = weightInKG;
		this.activityLevel = activityLevel;
	}

	public static User getInstance()
	{
		if (instance == null) 
		{
            instance = new User(getAge(), getGender(), getHeightInCM(), getWeightInKG(), getActivityLevel());
        }
        return instance;	
    }
	
	// method 1
	public static int getAge() 
	{ 
		return age; 
	}
	
    // method 2
	public static String getGender() 
	{ 
		return gender; 
	}

    // method 3
	public static int getHeightInCM() 
	{ 
		return heightInCM; 
	}

    // method 4
	public static double getWeightInKG() 
	{ 
		return weightInKG; 
	}
	
	//method 5
	public static int getActivityLevel() 
	{ 
		return activityLevel; 
	}
}
