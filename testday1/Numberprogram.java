package testday1;

public class Numberprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;
		
		// to store the  result we need to create a new variable.
		int n3 = multiply(n1,n2);
		int n4 = add(n1,n2);
		int n5 = subtraction(n1,n2);
		
		// print the output
		
		System.out.println("Outcome is " +  n3 );
		System.out.println("Outcome is " +  n4 );
		System.out.println("Outcome is " +  n5 );
	}
	
	public static int add(int a,int b) 
	{
				
		return a+b ;
		
	}
	public static int subtraction(int a,int b) 
	{
				
		return a-b ;
		
	}
	public static int multiply(int a,int b) 
	{
				
		return a*b ;
		
	}
	
}
