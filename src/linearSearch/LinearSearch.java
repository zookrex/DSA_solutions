package linearSearch;

import java.util.Arrays;

public class LinearSearch {

	public static int linearSearch(int arr[], int k) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] == k)
				return i;
		}

		return -1;
	}

	public static int[] twoDlinearSearch(int arr[][], int k) {
		int n = arr.length;
		int ans[] = new int[2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == k) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}

		return new int[] { -1, -1 };
	}

	public static boolean stringLinear(String s, char ch) {

		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == ch)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

		int[] a = { 1, 5, 12, 4, 6, 7, 5 };
		int[][] a2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 7 } };

		System.out.print("index= " + linearSearch(a, 12));
		System.out.println();
		System.out.print("index= " + Arrays.toString(twoDlinearSearch(a2, 50)));
		

	}

}
