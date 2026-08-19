class Program12{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
				for(int j=i;j<=n;j++){
					System.out.print(n-i+1);
				}
			}
			else{
				for(int j=i;j>=n;j--){
					System.out.print(i-n+1);
				}
			}
			System.out.println();
		}
	}
}
/*
55555
4444
333
22
1
22
333
4444
55555
*/