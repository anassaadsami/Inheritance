package infoInheritanceUpCasting;

public class Main2 {

	public static void main(String[] args) {
		
		// just to know we can have more than one main class in the same package
		// i want to change just in local Repository
		/*
		 * here we have reference variable p2 of type Person which have the address of
		 * the Student object p2 can access all the method and the attributes in Class
		 * Student which have original copy in Person class
		 */
		Person p2 = new Student(5555, "electric"); // invoke first non parameterized Person constructor
		System.out.println(p2.name); // -----------> null cause we create a student object with no name in
										// constructor
//		p2.student_intro();  //-----------> error p2 is a reference variable of type Person and it can access in Student class attributes and m

		// method that just have been overwritten from Person class
		Student s3 = new Student(6666, "dynamin");
		s3.student_intro(); // -------> OK

		Student s2 = new Student(4444, "java"); // here when we create an object from Student
		// class and we dos'nt invoke parameterized constructor of super class so we
		// invoke
		// by default non parameterized constructor from super class and that why this
		// non
		// parameterized constructor must written in super class

		System.out.println(s2.name); // ------> null cause we use constructor with just 2 parameter and no name in it
		System.out.println(s2.toString()); // s2 name is null and age 0 and is_married false

		/*
		 * we can not code Student s4 = new Person(); its error
		 */
        // p3 can access just the attributes and methods which have been override from Person class
		Person p3 = new Student ("aya", 30 , true , 777 , "doctor");
	// ex	p3.department   -----> error 
		s2.setLastName("ahemed");
		System.out.println(s2.getLastName());
		
	
	}

}
