class Program69b{
	public static void main(String args[]){
		int n=6;
		int count=1;
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//15
			for(int j=i;j<=n;j++){//6<=5
				System.out.print(c+"\t");//5
				c-=j;//
			}
			System.out.println();
			count+=i;//15+1=16
		}
	}
}

/*

1	
6	2	
10	7	3	
13	11	8	4
15	14	12	9	5
_

*/