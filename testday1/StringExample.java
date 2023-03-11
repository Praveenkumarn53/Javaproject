package testday1;

public class StringExample {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		String name = "Benak";
		String name1 = "Advith" ;
		String name3 = name+name1;
				
        StringBuffer name4 = new StringBuffer(name+name1);
        name4.reverse();
		System.out.println(name4);
		
		
		System.out.println(name.length());
		System.out.println(name1.length());
		
//		one more way to get length of 2 strings.
		 
		System.out.println(name3.length() );
		
		

		System.out.println(name.length() + name1.length());
		System.out.println(name3.charAt(2));
		System.out.println(name3.toUpperCase());
		System.out.println(name3.toCharArray());
		
	}

}
