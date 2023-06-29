package binarySearch;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/?ref=gcse

// we are assuming the length of array is infinite , 
// so end value in ans() will never be > array length
public class InfiniteArray {
	
	public static int binarySearch(int a[],int k,int s,int e) {
		//int s=0,e=a.length-1;
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(a[m]<k)
				s=m+1;
			else if(a[m]>k)
				e=m-1;
			else return m;
		}
		return -1;
	}
	
	public static void ans(int[] arr,int target) {
		int start=0,end=1;
		
		while(arr[end]<target) {
			int newS=end+1;
			end=end+(end-start+1)*2;
			start=newS;
		}
		
	
		System.out.println(binarySearch(arr, target,start,end));
	}

	public static void main(String[] args) {
		int [] a= {1,2,35,9,12,15,16,23,25,26,29,30};

		ans(a,2);


	}

}
