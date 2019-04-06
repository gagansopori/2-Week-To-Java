// An implementation of Sorting Algorithms in Java

import java.util.Scanner;
import java.util.Random;


class selection_sort {

	public void selectionSort(int[] arr) {

		for(int i = 0; i < arr.length-1; i++) {

			int min_index = i;
			for(int j = i+1; j < arr.length-i-1; j++) {	

				if(arr[j] < arr[min_index]) {
					int temp = arr[min_index];
					arr[min_index] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("The Array was Sorted using Selection Sort.");
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

		sorting_algorithms srt = new sorting_algorithms();

		srt.selectionSort(arr);
	}
}