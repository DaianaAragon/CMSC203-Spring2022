
public class Demo {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		p1.setName("Amy");
		p1.setAge(20);
		
		
		
		System.out.println(p1.getName() + " is "+ p1.getAge() + " years old");
		
		
		
		Student s1 = new Student();
		
		s1.setName("Bob");
		s1.setAge(21);
		s1.setStudentId(1234);
		
		
		System.out.println(s1.getName() + " is "+ s1.getAge() + " years old, Student's ID is " + s1.getStudentId());
		
		
		
		
		
		
		
		
		
	}

}
