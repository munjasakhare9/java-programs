class FactorialRec{
	public static void main(String args[]){
		int n=6;
		n=findFactorial(n);
		System.out.println(n);
	}
	private static int findFactorial(int n){
		if(n<=1){
			return 1;
		}
		return n*findFactorial(n-1);
	}
}