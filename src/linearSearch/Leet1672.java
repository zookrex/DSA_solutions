package linearSearch;

public class Leet1672 {
	
	 public static int maximumWealth(int[][] a) {
	        int max=0;

	        for(int i=0;i<a.length;i++){
	             int sum=0;
	            for(int j=0;j<a[i].length;j++){
	                sum+=a[i][j];
	            }
	            if(sum>max)
	            max=sum;

	        }
	        return max;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 7 } };
		System.out.println(maximumWealth(a2));

	}

}
