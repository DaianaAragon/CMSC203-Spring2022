public class ExceptionExamples {
	
	public static String concatName(String s1, String s2  )  throws NullPointerException
	{
		if  (s1 == null || s2 == null)
			throw new NullPointerException("Null argument");
		else
			return s1+s2; 
		
	}

}

