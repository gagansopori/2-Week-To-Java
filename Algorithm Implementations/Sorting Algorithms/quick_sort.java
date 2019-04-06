// An implementation of Sorting Algorithms in Java
import java.util.Scanner;
import java.util.Random;

class quick_sort {

	public void quickSort(int[] arr, int low, int high) {

		if (low < high) {

			int pi = partition(arr, low, high);

			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
		
	}

	public int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low-1);

		for(int j = low; j < high; j++) {

			if(arr[j] <= pivot) {

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
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

		for(int j : arr) {

			System.out.println(arr[j]);
		}

		quick_sort srt = new quick_sort();

		srt.quickSort(arr, 0, arr.length-1);


		System.out.println("The Array was Sorted using Quick Sort...");
		for(int k : arr) {

			System.out.println(arr[k]);
		}
	}
}