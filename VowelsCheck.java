package testPackage;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green Word";
		
		int count = 0;
		
		for(int index=0; index<str.length(); index++) {
			
			char ch = str.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Total number of vowels "+count);
		
		//Switch use
		str = "Clean World Green World";
		count =0;
		
		for(int index=0;index<str.length();index++) {
			
			char ch = str.charAt(index);
			
			switch(ch) {
			
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					break;
						
			}
			
		}
		
		System.out.println("Total vowels are " + count);


	}

}
