class Program70{
	public static void main(String args[]){
		int n=5;
		int count=n;//5
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//15
			for(int j=i;j<=n;j++){//6<=5
				System.out.print(c+"\t");//1
				c-=j+1;//
			}
			System.out.println();
			count+=i-1;//15-0=15
		}
	}
}

/*

5	
9	4	
12	8	3	
14	11	7	2	
15	13	10	6	1	
-

*/