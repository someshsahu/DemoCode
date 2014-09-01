package DemoGit.Demo;

public class StringFunction 
{
	// Method to concatenate two string
	public  String concatenate(String one, String two) 
	{
			return one + two;
	}	
	// Method to compare two string
	public boolean EqualsMethod(String one, String two)
	{
		if(one.equals(two))
			return true;
		else 
			return false;
	}
	// Method to check substring
	public String SubStringMethod(String one)
	{
		String s=one.substring(0,2);
		return s;
	}
	// Method to check that strings are in lower case
	public String ToLowerCaseMethod(String one)
	{
		String s=one.toLowerCase();
		return s;
	}
}

