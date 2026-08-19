class Program202{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			int c=(i%2!=0)?64:96;
			if(i<=n){
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				for(int j=i;j>=1;j--){
					System.out.print((char)((n-i+1)+c));
				}
			}
			else{
				for(int j=i;j>n;j--){
					System.out.print(" ");
				}
				for(int j=i;j<=(n*2)-1;j++){
					System.out.print((char)((i-n+1)+c));
				}
			}
			System.out.println();
		}
	}
}