class Program84{
	public static void main(String args[]){
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print((char)(count+96));
				count++;
			}
			System.out.println();
		}
	}
}