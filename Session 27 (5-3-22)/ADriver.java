
public class ADriver {

	public static void main(String[] args) {
		
		try
		{
			A.m1();
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Something happened");
		}

	}

}
