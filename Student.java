package infoInheritanceUpCasting;

public class Student extends Person{
//    super(name, age, is_married);    this is error  (here can not use super) just in constructor
	int id ;               // special attributes for Student class + attributes which inherited
	String department ;   // from Person class  
	
	public Student(int id , String department) {  // here this constructor doe'st invoke any parameterized constructor 
		this.id = id ;    // from super class and that's why we invoke by default non parameterized constructor
		this.department = department;  // which must be written in super class otherwise error
		System.out.println("hi from parameterized constructor of subclass with just 2 attributes");
	}
	
	public Student(String name , int age , boolean is_married , int id, String department) {
		super(name, age , is_married);   // invoke Person parameterized constructor which 
		this.id = id;                     //  not contains lastName (private attribute) 
		this.department = department;
		System.out.println("hi from parameterized constructor of subclass");
	}
	// by inheritance we have already getters and setters for all attributes which be inherited from Person class
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", department=" + department + ", name=" + name + ", age=" + age + ", is_married="
				+ is_married + "]";
	}
	public  void student_intro() {
		System.out.println("hi this is from student "+ this.getName());
	}
 
 
	
	

}
