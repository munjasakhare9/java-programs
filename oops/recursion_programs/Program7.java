class Program7{
	
	void printSum(int n, int sum){
		if(n<1){
			System.out.println(sum);
			return;
		}
		printSum(n-1,sum+n);
	}
	
	public static void main(String args[]){
		Program7 p=new Program7();
		p.printSum(3,0);
	}
}