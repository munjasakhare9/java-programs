class Program182{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
				for(int j=i;j<=n;j++){
					System.out.print("*");
				}
			}
			else{
				for(int j=(n*2-i);j<=n;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}