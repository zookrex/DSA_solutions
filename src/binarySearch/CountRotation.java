package binarySearch;

public class CountRotation {
	
	public static int pivot(int [] a) {
		
		int s=0,e=a.length-1;
		
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(m>s && a[m]<a[m-1])
				return m-1;
			if(e>m && a[m]>a[m+1])
				return m;
			if(s>=e)
				e=m-1;
			else
				s=m;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int [] n= {4,5,6,7,9,1,2,3};
		int ans=pivot(n)+1;
		System.out.println(ans);

	}

}
