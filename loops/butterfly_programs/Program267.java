class Program267{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			if(i==1){
				for(int j=n;j>=i;j--){
					if(j%2!=0){
						System.out.print((char)(j+64));
					}
					else{
						System.out.print((char)(j+96));
					}
				}
				for(int j=i+1;j<=n;j++){
					if(j%2!=0){
						System.out.print((char)(j+64));
					}
					else{
						System.out.print((char)(j+96));
					}
				}
			}
			else{
				for(int j=n;j>=i;j--){
					if(j%2!=0){
						System.out.print((char)(j+64));
					}
					else{
						System.out.print((char)(j+96));
					}
				}
				for(int j=1;j<=(i*2)-3;j++){
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
			}
			System.out.println();
		}
	}
}
/*
EdCbAbCdE
EdCb bCdE
EdC   CdE
Ed     dE
E       E
*/