
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String str = new String("John");
		
		str.toUpperCase();
		
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder("John");
		
		str2.append(" Doe");
		
		System.out.println(str2);
		
		str2.append('f');
		
		System.out.println(str2);
		
		str2.append(20.3);
		
		System.out.println(str2);
		
	}

}
