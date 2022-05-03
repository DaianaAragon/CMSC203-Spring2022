
public class CompareToDemo {

	public static void main(String[] args) {
		
		String n1 = "Sunx";
		
		String n2 = "SunX";
		
		// compareTo method overridden in String class
		// Compares ASCII values of letters
		System.out.println(n1.compareTo(n2));
		
		Circle c1 = new Circle("Sun", "Yellow", 5);
		Circle c2 = new Circle("Moon", "Blue", 10);
		
		System.out.println(c1.compareTo(c2));

	}

}
