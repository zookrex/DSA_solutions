package binarySearch;



public class Leet1095 {
	 public static int binarySearch( MountainArray arr,int target,int start,int end, boolean x){
	        while(start<=end){
	          
	          int m=start+(end-start)/2;

	        if(x){
	            if(arr.get(m)==target)
	            return m;
	         else  if(arr.get(m)>target)     
	            end=m-1;
	          else
	            start=m+1;
	          
	          }
	          else{
	              if(arr.get(m)==target)
	            return m;
	            else  if(arr.get(m)>target)     
	                start=m+1;
	          else
	                end=m-1;
	          }
	          

	        }
	        return -1;

	    }


	    public static int findInMountainArray(int target, MountainArray arr) {
	          int s=0;
	          int e=end(arr);
	         int ans= binarySearch(arr,target,s,e,true);

	         if(ans!=-1)
	         return ans; 
	        else
	             return binarySearch(arr,target,e+1,arr.length()-1,false);  
	        
	        
	                 
	    }
	    public static int end(MountainArray arr){
	          int s=0,e=arr.length()-1;
	          
	       while(s<e){
	          
	          int m=s+(e-s)/2;

	          if(arr.get(m)>arr.get(m+1))
	           e=m;
	        else
	            s=m+1;
	       }
	       
	       return s;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainArray arr=new MountainArray() {
			int [] a= {1,2,3,4,5,3,1};
			@Override
			public int length() {
				
				return a.length;
			}
			
			@Override
			public int get(int index) {
				// TODO Auto-generated method stub
				return a[index];
			}
		}; 
		System.out.println(findInMountainArray(3,arr));
		

	}

}
