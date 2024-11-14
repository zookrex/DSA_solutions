package binarySearch;

import java.util.Arrays;

// Here Matrix is sorted on the col and row basis
//but its not proper sorted 
//if we use 47 instead of 41 in arr its still valid 
//Testing something

public class BinarySearch_2D_row_col {
	public static int[] search(int[][] a,int k) {
		int [] ans= {-1,-1};
		int r=0,c=0,n=a.length;
		c=a[0].length-1;
		while(r<n && c>=0) {
			if(a[r][c]==k)
			{
				ans[0]=r;
				ans[1]=c;
				return ans;
			}
			else if(a[r][c]>k)
				c--;
			else r++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{10,20,30,40},{15,25,35,45},{21,31,41,49}
	};
		System.out.println(Arrays.toString(search(arr,49)));
		int [][] arr1= {{1,2,3,4},{5,6,7,8},{9,10,11,12}
		};
			System.out.println(Arrays.toString(search(arr1,9)));

}
}
