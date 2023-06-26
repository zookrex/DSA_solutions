package linearSearch;

import java.util.Arrays;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Leet1295 {
	
	public static int findEven(int [] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			
			 if(Integer.toString(a[i]).length()%2==0)
				 count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n= {12,345,2,4,7896};
		System.out.println(findEven(n));

	}

}
