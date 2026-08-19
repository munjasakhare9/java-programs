class Program93{
	public static void main(String args[]){
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}
}