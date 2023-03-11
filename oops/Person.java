package oops;

public class Person extends Person {
	
	public int SSN;
	
	public Person() {
		
		super ();
		System.out.println("inside default cons of Citizen");
	}
	
	public Person(String Name, String CountryName, int age, int SSN) {
		
		super ();
System.out.println("Inside param cons of Citizen");
		
		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;	
	}
	
	public void Print() {
		
		System.out.println("SSN is " + SSN);
		
	}

}

