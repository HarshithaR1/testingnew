package functions;

public class Greatest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Greatest of 3 nos");
		System.out.println(greater(10,34,'a'));// auto widening
		

	}

	private static int greater(int a, int b, int c) {
		
		// TODO Auto-generated method stub
		
		if(a>b && a>c) {

				//System.out.println(a+" is the greatest");
				return a;
			
			
		
		}
		if(b>a && b>c) {

			//System.out.println(b+" is the greatest");
			return b;
		
	
	}
		else
			//System.out.println(c + " is the greatest");
		return c;
	}

}
