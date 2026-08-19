class Program245{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
				for(int j=i;j>1;j--){
					System.out.print(" ");
				}
				for(int j=(n-i+1)*2-1;j>=1;j--){
					System.out.print(n-i+1);
				}
			}
			else{
				for(int j=i;j<(n*2)-1;j++){
					System.out.print(" ");
				}
				for(int j=(i-n+1)*2-1;j>=1;j--){
					System.out.print(i-n+1);
				}
			}
			System.out.println();
		}
	}
}
/*
27.

555555555
 4444444
  33333
   222
    1
   222
  33333
 4444444
555555555
*/