// An implementation of Sorting Algorithms in Java

import java.util.Scanner;
import java.util.Random;

class bubble_sort {

	public void bubbleSort(int[] arr) {

		System.out.println("Unsorted Array.");
		for(int j : arr) {
			System.out.println(arr[j]);
		}

		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					System.out.println("i = " + i + "j=" +j);
					System.out.println(arr[j]);
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("The Array was sorted using Bubble Sort.");
		for(int j : arr) {
			System.out.println(arr[j]);
		}
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

		bubble_sort srt = new bubble_sort();

		srt.bubbleSort(arr);
	}
}