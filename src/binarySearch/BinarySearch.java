package binarySearch;

public class BinarySearch {
	
	public static int search(int a[],int k) {
		
		int start=0;
		
		int end=a.length-1;
		int n=end+1;
		
		
		while(start<=end) {
			
			int	 mid=start+((end-start)/2);
			
			if(a[mid]==k)
				return mid;
			else if(a[mid]<k)
			start=mid+1;
			
			else
				end=mid-1;
		}
		
		return -1;
	}
	public static int searchDec(int a[],int k) {
		
		int start=0;
		
		int end=a.length-1;
		int n=end+1;
		
		
		while(start<=end) {
			
			int	 mid=start+((end-start)/2);
			
			if(a[mid]==k)
				return mid;
			else if(a[mid]<k)
				end=mid-1;
			
			else
				start=mid+1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
	int [] a= {1,2,35,9,12,15,16,23,25,26,29,30};
	int [] a1= {30,28,24,21,10};
		System.out.println(search(a,23));
		System.out.println(searchDec(a1,24));

	}

}
