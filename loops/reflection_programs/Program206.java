class Program206{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
				for(int j=i;j<n;j++){
					System.out.print(" ");
				}
				for(int j=(n-i+1);j<=n;j++){
					int c=(j%2!=0)?64:96;
					System.out.print((char)(j+c));
				}
			}
			else{
				for(int j=i;j>n;j--){
					System.out.print(" ");
				}
				for(int j=(i-n+1);j<=n;j++){
					int c=(j%2!=0)?64:96;
					System.out.print((char)(j+c));
				}
			}
			System.out.println();
		}
	}
}