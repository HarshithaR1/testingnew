package functions;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(10,20,30));
		System.out.println(add(10,20));
		System.out.println(add(10,20,30,40));
	}

	private static int add(int i, int j, int k) {
		// TODO Auto-generated method stub
	   int res = i+j+k;
		return res;
	}


	private static int add(int i, int j) {
		// TODO Auto-generated method stub
	   int res = i+j;
		return res;
	}

	private static int add(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
	   int res = i+j+k+l;
		return res;
	}
}
