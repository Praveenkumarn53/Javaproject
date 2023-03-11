package testday1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "NITIN";

		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			result = result + str1.charAt(i);

		}

		System.out.println("Reversed string is " + result);

		if (str1.equals(result)) {

			System.out.println("Given word is pallindrom");
		} else {
			System.out.println("Given word is not a pallindrom");
		}
//=======================
		String str2 ="David meets john and lilly";
		
		String[] arr = str2.split(" ");
		
		String result1="";
		
		for (int i=arr.length-1;i>=0;i--)
		{
			result1=result1+arr[i]+ " ";
		}
		System.out.println(result1.trim());
	}
}
