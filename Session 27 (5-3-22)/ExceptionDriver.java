public class ExceptionDriver {
	public static void someMethod(String s1, String s2) {
	
		//try 
		//{
			String s=ExceptionExamples.concatName(s1,s2);
			System.out.println(s);
		//}
		/*catch (Exception e)
		{
			System.out.println("In the someMethod catch block");
		}*/
		finally {
			System.out.println("In the finally Block of someMethod ");
		}
		// This is going to be executed ONLY IF exception is handled
		System.out.println("End of someMethod");
		}

	public static void main(String[] args)
	{
		try {
			someMethod(null,"Hello");
			someMethod("Hi","Hello");
		}
	    catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("In the finally Block of main ");
			
		}
		System.out.println("End of main!");
		
	}
}
