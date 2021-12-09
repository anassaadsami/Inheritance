package infoInheritanceUpCasting;

public class Person {   // this is super class 
	final String address = "sollentuna";
	String name;
	int age;
	boolean is_married;
	private String lastName ;   // private attribute 

	public String getAddress() {
		return address;    // we have just get address not setAddress cause its final 
	}


	public Person() { // non parameterized constructor
		System.out.println("hi from non parameterized constructor of super class");
	}

	public Person(String name, int age, boolean is_married ) {  // constructor without private LastName
		this.name = name;   // so we can invoke this constructor in Student class
		this.age = age;
		this.is_married = is_married;
		System.out.println("hi from parameterized constructor of super class");
	}

	public Person(String name, int age, boolean is_married , String lastName) {
//		this.name = name;      // this constructor can not be invoked by Student class cause it has 
//		this.age = age;          // private attribute lastName
//		this.is_married = is_married;
		this(name, age, is_married);   // its easier
		this.lastName = lastName;
		System.out.println("hi from parameterized constructor of super class");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", is_married=" + is_married + ", lastName="+ lastName+ "]";
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIs_married() {
		return is_married;
	}

	public void setIs_married(boolean is_married) {
		this.is_married = is_married;
	}
	public int discount () {
		if(this.is_married)
		return 500;
		else
		return 250;
	}	
		public void display () {
			System.out.println("hi "+ getLastName());
		}
		public final void print() {
			System.out.println("this is final method in Person class which can not be overridden ");
		}
	}
	


