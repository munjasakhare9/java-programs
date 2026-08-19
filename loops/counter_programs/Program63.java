class Program63{
	public static void main(String args[]){
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++){
			int c=count;
			for(int j=i;j>=1;j--){
				System.out.print(c+"\t");
				c--;
			}
			count+=i+1;
			System.out.println();
		}
		System.out.println("out of for :- "+count);
	}
}