package binarySearch;

public class Leet33_Rotaional {
	
	public static int pivot(int [] a) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(m<e && a[m]>a[m+1])
				return m;
			if(m>s && a[m-1]>a[m])
				return m;
			if(a[s]>=a[m])
				e=m-1;
			else
				s=m+1;
		}
		
		
		return -1;
	}
	
	public static int pivotWithDuplicates(int [] a) {
		int s=0,e=a.length-1;
		while(s<=e) {
			int m=s+(e-s)/2;
			
			if(m<e && a[m]>a[m+1])
				return m;
			if(m>s && a[m-1]>a[m])
				return m;
//			if(a[s]>=a[m])
//				e=m-1;
//			else
//				s=m+1;
			if(a[s]==a[m] && a[m]==a[e]) {
				if(a[s]<a[s+1])
					return s;
				s++;
				if(a[e]<a[e-1])
					return e-1;
				e--;
			}
			else if(a[s]<a[m] || (a[m]==a[s] && a[m]>a[e]))
				s=m+1;
			else e=m-1;
		}
		
		
		return -1;
	}
	


    public static int binarySearch2(int [] a,int k,int s,int e){
        
        while(s<=e){
            int m=s+(e-s)/2;

            if(a[m]==k)
            return m;
            else if(a[m]>k)
            e=m-1;
            else
            s=s+1;
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int p=pivot(nums);
        int ans=-1;
        

        if(p==-1)
            return binarySearch2(nums,target,0,nums.length-1);
        if(nums[p]==target)
            return p;
        
        if(binarySearch2(nums,target,0,p)!=-1)
            return binarySearch2(nums,target,0,p);
        if( binarySearch2(nums,target,p+1,nums.length-1)!=-1)
            return binarySearch2(nums,target,p+1,nums.length-1);
        else return -1;

    }

	public static void main(String[] args) {
		int [] n= {3,4,5,6,7,9,0,1,2,3,4,5};
		System.out.println(pivot(n));
		System.out.println(search(n,0));

	}

}
