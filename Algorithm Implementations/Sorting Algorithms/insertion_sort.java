// An implementation of Sorting Algorithms in Java
import java.util.Scanner;
import java.util.Random;

class insertion_sort {

	public void insertionSort(int[] arr) {

		for(int i = 0; i < arr.length-1; i++) {

			int index = arr[i];
			int j = i-1;

			while(j >= 0 && arr[j] > index) {

				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = index;		//This will always be the first element
		}
		System.out.println("The Array was Sorted using Insertion Sort.");
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

		insertion_sort srt = new insertion_sort();

		srt.insertionSort(arr);
	}
}