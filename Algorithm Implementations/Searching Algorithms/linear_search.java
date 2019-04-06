// program that implements linear-search in an array
import java.util.Scanner;
import java.util.Random;

class linear_search {

	public int searchElement(int num, int[] rand_num) {

		System.out.println("Searching for number in the Array...");

		for(int i = 0; i < rand_num.length; i++) {
			if(num == rand_num[i]){
				return i;
			}
		} return -1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How Many Elements do you want in the Randomly Generated Array?");
		int numberOfElements = scan.nextInt();

		int ran_num[] = new int[numberOfElements];

		System.out.println("Randomly Getting Array Elements...");
		Random rand = new Random();
		for(int i = 0; i < numberOfElements; i++) {
			ran_num[i] = rand.nextInt(numberOfElements)+1;
		}

		System.out.print("Enter the number you want to Search: ");
		int num = scan.nextInt();

		linear_search search = new linear_search();

		int result = search.searchElement(num, ran_num);

		if( result == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}