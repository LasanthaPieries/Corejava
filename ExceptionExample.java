package testPackage;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {3, 4, 5};
		
		int num = 10;
		
		try {
			int res = num / 10;
			System.out.println(array1[5]);
		}catch(ArrayOutOfBoundsException e) {
			System.out.println("Inside array catch block");
		}catch(ArthmaticException e) {
			System.out.println("Inside arithmatic exception");
		}finally {
			System.out.println("Inside finally");
		}
		
		System.out.println("After exception");
		

	}

}
