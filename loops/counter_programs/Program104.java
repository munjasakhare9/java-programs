class Program104{
	public static void main(String args[]){
		int n=5;
		int count=(n*(n+1))/2;
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print((char)(count+96));
				count--;
			}
			System.out.println();
		}
	}
}