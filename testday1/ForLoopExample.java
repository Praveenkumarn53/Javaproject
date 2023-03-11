package testday1;

public class ForLoopExample {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		for (int num = 1; num <11; num++)
			
		{
			System.out.println(num);
		}
		
		System.out.println("Second loop");
		for (int num= 10; num>=0; num-=2)
			
		{
			System.out.println(num);
		}
	
	
		System.out.println("Thrid for loops for tables");
		int i=2;
		for (int num= 1; num<=10; num++) {
			System.out.println(num*i);

		}

		
/*System.out.println("Table of 2");
		
		int num=2;
		for(int i=1;i<11;i++) {
			System.out.println(num*i);
			//System.out.printf("%d * %d = %d \n" , num , i, num*i);
		}
		System.out.println("End Table of 2");*/
		
		
		// array with strings
		
		int[] arr1 = {10,20,30,40};
		for (int n=0; n<arr1.length; n++);
		{
			System.out.println(arr1);
		}
		
	}
	
	
	

}
