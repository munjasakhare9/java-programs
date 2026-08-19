class Program239{
	public static void main(String args[]){
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=i;j<n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++){
				if(i%2!=0){
					System.out.print((char)(i+64));
				}
				else{
					System.out.print((char)(i+96));
				}
			}
			System.out.println();
		}
	}
}
/*
21. 

EEEEEEEEE
 ddddddd
  CCCCC
   bbb
    A

*/