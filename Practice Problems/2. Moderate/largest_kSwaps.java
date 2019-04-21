import java.util.*;
import java.lang.*;
import java.io.*;

class largest_kSwaps {

	public int find_maximum(int num, int k) {

		int max = num;
		System.out.println("K = " +(k));

		if(k == 0) {
			System.out.println("Sorry");
			return num;
		} 
		
		StringBuilder sb = new StringBuilder(Integer.toString(num));

		for(int i = 0; i < sb.length()-1; i++) {
			for(int j = i+1; j < sb.length(); j++) {
				if(sb.charAt(i) < sb.charAt(j)) {

					char temp = sb.charAt(i);
					sb.setCharAt(i, sb.charAt(j));
					sb.setCharAt(j, temp);

					String t = sb.toString();
					System.out.println("String T: " +t);
					System.out.println("Max: " +max);

					if(max < Integer.parseInt(t)) {

						max = Integer.parseInt(t);
						find_maximum(max, k-1);
					}
				}
			}
		}
	
		return max;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		largest_kSwaps wl = new largest_kSwaps();

		System.out.println("Enter the Number: ");
		int num = scan.nextInt();

		System.out.println("Enter the Number of Swaps:");
		int k = scan.nextInt();

		int m = wl.find_maximum(num, k);

		System.out.println(m);
	}
}