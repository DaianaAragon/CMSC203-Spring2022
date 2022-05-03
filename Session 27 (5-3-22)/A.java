
public class A {
	
	public static void m1 () 
	{
		m2();
		
		System.out.println("In m1");
	}
	
	public static void m2 () 
	{
		try
		{
			m3();
		}
		
		catch (Exception e)
		{
			System.out.println("Something happened in m2");
		}
		
		System.out.println("In m2");
	}
	
	/**
	 * 
	 * @throws ArithmeticException
	 */
	
	public static void m3 () throws ArithmeticException 
	{
		System.out.println("In m3");
		throw new ArithmeticException("Error");
	}

}
