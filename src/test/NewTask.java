package test;

import java.util.Arrays;

public class NewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create 3 arrays and compare each other
		
	int a[]= {1, 2, 3};
	int b[]= {1, 2, 3};
	int c[] = {1, 2};
	int d[] = {3,2,2};
	
	System.out.println(Arrays.equals(a, b));
	System.out.println(a.length==b.length);

	System.out.println(Arrays.equals(a, c));

	System.out.println(Arrays.equals(a, d));

	
	
	
	}

}
