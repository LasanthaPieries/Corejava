package testPackage;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("Ëven Number ");
		}else {
			System.out.println("Ödd Number ");
		}
	}

}
