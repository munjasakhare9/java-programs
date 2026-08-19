class Program68{
	public static void main(String args[]){
		int n=5;
		int count=((n*(n+1))/2)-(n-1);//11
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//15
			for(int j=n;j>=i;j--){//0>=1
				System.out.print(c+"\t");
				c-=j;//
			}
			System.out.println();
			count++;//16
		}
	}
}

/*

11	
12	7	
13	8	4	
14	9	5	2	
15	10	6	3	1
_

*/