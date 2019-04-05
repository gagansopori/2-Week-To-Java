import java.util.Scanner;

class unique_number
{
	// implement an algorithm to determine if a string has all unique characters, what if you cannot use additional data structure?
	public int check_unique(String testString) {
		
		int flag = -1;

		for(int i = 0; i <= testString.length(); i++) {
			for (int j = i+1; j <= testString.length()-1; j++) {
				if(testString.charAt(i) == testString.charAt(j)){
					flag = 0;
					break;
				}
			}
		}

		return flag;
	}


	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		unique_number uni_num = new unique_number(); 
		String testString = "";
		System.out.println("Enter the desired string:");
		testString = scan.next();

		int flag = uni_num.check_unique(testString);
		
		

		if(flag == -1) {
			System.out.println("The string is totally unique" );
		}
		else {
			System.out.println("The string is not unique");
		}
	}
}
