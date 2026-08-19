class Program251{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j>1;j--){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				if(j%2!=0){
					System.out.print((char)(j+64));
				}
				else{
					System.out.print((char)(j+96));
				}
			}
			for(int j=n-1;j>=i;j--){
				if(j%2!=0){
					System.out.print((char)(j+64));
				}
				else{
					System.out.print((char)(j+96));
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=i;j>1;j--){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				if(j%2!=0){
					System.out.print((char)(j+64));
				}
				else{
					System.out.print((char)(j+96));
				}
			}
			for(int j=n-1;j>=i;j--){
				if(j%2!=0){
					System.out.print((char)(j+64));
				}
				else{
					System.out.print((char)(j+96));
				}
			}
			System.out.println();
		}
	}
}
/*
33.

AbCdEdCbA
 bCdEdCb
  CdEdC
   dEd
    E
   dEd
  CdEdC
 bCdEdCb
AbCdEdCbA
*/