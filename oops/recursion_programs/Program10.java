class Program10{
	int fact(int n){
		if(n==0){
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String args[]){
		Program10 p=new Program10();
		System.out.println(p.fact(5));
	}
}