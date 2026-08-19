class Program263{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			if(i==1){
				for(int j=1;j<=(n*2)-1;j++){
					if(i%2!=0){
						System.out.print((char)(i+64));
					}
					else{
						System.out.print((char)(i+96));
					}
				}
			}
			else{
				for(int j=i;j<=n;j++){
					if(i%2!=0){
						System.out.print((char)(i+64));
					}
					else{
						System.out.print((char)(i+96));
					}
				}
				for(int j=1;j<=(i*2)-3;j++){
					System.out.print(" ");
				}
				for(int j=i;j<=n;j++){
					if(i%2!=0){
						System.out.print((char)(i+64));
					}
					else{
						System.out.print((char)(i+96));
					}
				}
			}
			System.out.println();
		}
	}
}
/*
AAAAAAAAA
bbbb bbbb
CCC   CCC
dd     dd
E       E
*/