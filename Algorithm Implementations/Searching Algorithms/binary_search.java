// Program that implements binary search in an Array. 
// The pre-requisite for binary search is that the array should be sorted.

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


class binary_search {


	public int searchElement(int num, int[] arr) {

		System.out.println("Searching for number in the Array...");

		int low = 0, high = arr.length-1;

		while(low <= high) {

			int mid  = low+(high-low)/2;  //important step. see the pattern

			if(arr[mid] == num) {

				return mid;

			} else if (arr[mid] < num) {

				low = mid+1;

			} else {

				high = mid-1;
			}
		} return -1;
	}



	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How Many Elements do you want in the Randomly Generated Array?");
		int numberOfElements = scan.nextInt();

		int arr[] = new int[numberOfElements];

		System.out.println("Randomly Getting Array Elements...");
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(numberOfElements);
		}
		
		Arrays.sort(arr);

		for(int j = 0; j < arr.length; j++) {
			System.out.println("J: " +j);
			System.out.println(arr[j]);
		}


		System.out.print("Enter the number you want to Search: ");
		int num = scan.nextInt();

		binary_search search = new binary_search();

		int result = search.searchElement(num, arr);

		if( result == -1) {
			System.out.println("Element not Found");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}