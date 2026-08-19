class Program244{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=(n*2)-1;i++){
			if(i<=n){
				for(int j=n;j>i;j--){
					System.out.print(" ");
				}
				for(int j=1;j<=(i*2)-1;j++){
					System.out.print(i);
				}
				System.out.println();
			}
			else{
				for(int j=i;j>n;j--){
					System.out.print(" ");
				}
				for(int j=1;j<=(n*2-i)*2-1;j++){
					System.out.print(n*2-i);
				}
				System.out.println();
			}
		}
	}
}

/*
26.

    1
   222
  33333
 4444444
555555555
 4444444
  33333
   222
    1
*/