package testPackage;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World";
		String result = "";
		
		for(int index=str.length()-1; index >= 0; index--) {
			char ch = str.charAt(index);
			result = result + ch;
		}
		System.out.println("The reversed string is "+ result);
		
		int num = 45678901;
		int rus = 0;
		
		while(num > 0) {
			int rem = num % 10;
			rus = rus * 10 + rem;
			num = num / 10;
		}
		System.out.println("The resulted number is "+rus);

	}

}