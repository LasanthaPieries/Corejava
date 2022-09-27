package testPackage;

public class DtaTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30;
		int num2 = 20;
		
		int sum = num1 + num2;
		int mul = num1 * num2;
		float div =(float) num1 / num2;
		System.out.println("The sume of the numbers: "+sum);
		System.out.println("The multiplication of the numbers: " +mul);
		System.out.println("The division of the numbers is: "+div);
		
		String str1 = "Clean World Green World";
		System.out.println(str1);
		System.out.println(str1 + " - The string length: " +str1.length());
		
		char ch1 = str1.charAt(0);
		System.out.println("The first character is "+ch1);
		
		char chn = str1.charAt(str1.length() - 1);
		System.out.println("The last character of the string is " +chn);		
		
		// upper and lower cases
		System.out.println("The string in upper case is "+ str1.toUpperCase());
		System.out.println("The string in lower case is "+ str1.toLowerCase());
	}

}
