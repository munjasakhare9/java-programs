class Program158{
	public static void main(String args[]){
		int n=5;
		int count1=(n*(n+1))/2;
		int count2=(n*(n+1))/2;
		for(int i=1;i<=n;i++){
			int c1=count1;
			int c2=count2;
			for(int j1=i,j2=n;j1<=n&&j2>=i;j1++,j2--){
				System.out.print((char)(c1+64)+""+(char)(c2+64)+"\t");
				c1-=j1;
				c2-=j2;
			}
			System.out.println();
			count1-=i+1;
			count2--;
		}
	}
}
/*
OO      NJ      LF      IC      EA
MN      KI      HE      DB
JM      GH      CD
FL      BG
AK
*/