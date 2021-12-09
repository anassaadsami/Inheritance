package infoInheritanceUpCasting;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("anas", 43, true , 12345 , "java");
		System.out.println(s1.toString());
		Person p1 = new Person("ali", 36 , true , "aldoori");
		System.out.println(p1.toString());
		System.out.println(p1.age);  //--------->  43
		System.out.println(p1.getAge());  //   43  the same and that why we do age private
//		System.out.println(p1.lastName);    // error cause lastName is private 
		System.out.println(p1.getLastName());  // the same and that why we do age private
		System.out.println(s1.getLastName());   // null cause Student class don't have lastName
		System.out.println("------------------");
		
	
		p1.setLastName("albasri");
		System.out.println(p1.getLastName());
		
		System.out.println(s1.discount());
//		System.out.println(s2.discount());
		s1.display(); 
		s1.print();
		System.out.println(s1.getLastName());
		System.out.println(s1.address);
		System.out.println( p1.getLastName());
		System.out.println( p1.address);
//  		p1.address = "marsta";   ------> errer cause address is final
	
	}

}
