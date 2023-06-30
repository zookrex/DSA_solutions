package binarySearch;



public class BS_2D_SortedMatrix {
	public static int[] search(int a[][],int k,int start,int end, int row) {
			
		while(start<=end) {
			
			int	 mid=start+((end-start)/2);
			
			if(a[row][mid]==k)
				return new int[] {row,mid};
			else if(a[row][mid]<k)
			start=mid+1;
			
			else
				end=mid-1;
		}
		
		return new int[] {-1,-1};
	}
	

	public static int[] b2D(int [][] a,int k) {
		int [] ans= {-1,-1};
		
		int r=a.length-1,c=a[0].length-1;
		
		
		if(r==0) {
			return search(a, k, 0, c, r);
		}
		int rowS=0,rowE=a.length-1,midCol=c/2;
		while(rowS<(rowE-1)) {
		int mid=rowS+(rowE-rowS)/2;
		
		if(a[mid][midCol]==k)
			return new int[] {mid,midCol};
		
		if(a[mid][midCol]>k)
			rowE=mid;
		else rowS=mid;
		
		}
		
		if(a[rowS][midCol]==k)
			return new int[]{rowS,midCol};
		if(a[rowS+1][midCol]==k)
			return new int[]{rowS+1,midCol};
		
		// if still not found 
		//search in all other parts  (int a[][],int k,int start,int end, int row)
		
		if(k<=a[rowS][midCol-1])
			return search(a, k, 0, midCol-1, rowS);
		if(k<=a[rowS+1][midCol-1])
			return search(a, k, 0, midCol-1, rowS+1);

		if(k>=a[rowS][midCol+1] && k<a[rowS][c])
			return search(a, k, midCol+1, c,rowS);

		if(k<=a[rowS][midCol])
			return search(a, k,midCol+1,c, rowS+1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
