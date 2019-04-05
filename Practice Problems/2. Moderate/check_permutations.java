
import java.util.Scanner;
import java.util.Arrays;

class check_permutations
{
	public int check_anagram(String testString1, String testString2) {
		
		int flag = 0, sum1 = 0, sum2 = 0;

		if (testString1.length() == testString2.length()) {
			for (int i =0; i < testString1.length(); i++) {
				sum1 += testString1.charAt(i);
				sum2 += testString2.charAt(i);
			}
			
		}

		if (sum1 != sum2){

			flag = -1;
		}

		return flag;
	}


	public static void main(String[] args)
	{
		check_permutation perm_obj = new check_permutation();
		Scanner scan = new Scanner(System.in);

		String testString1 = "", testString2 = "";


		System.out.println("Enter the First string:");
		testString1 = scan.next();
		System.out.println("Enter the Second string:");
		testString2 = scan.next();

		int flag = perm_obj.check_anagram(testString1, testString2);
		
		

		if(flag == -1) {
			System.out.println("Strings are not Anagrams" );
		}
		else {
			System.out.println("Strings are Anagrams");
		}
	}
}
