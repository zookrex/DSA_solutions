package binarySearch;

public class Leet852 {
	
    public static int  peakIndexInMountainArray(int[] arr) {
        int s=0,e=arr.length-1;

        while(s!=e){
           
           int m=s+(e-s)/2;

           if(arr[m]>arr[m+1])
            e=m;
             if(arr[m]<arr[m+1])
             s=m+1;
        }
        return s;
     }

	public static void main(String[] args) {
		int [] n= {1,2,1,3,5,6,4};
		System.out.println(peakIndexInMountainArray(n));

	}

}
