class Program67{
	public static void main(String args[]){
		int n=5;
		int count=(n*(n+1))/2;//15
		
		for(int i=n;i>=1;i--){//1>=1
			int c=count;//11
			for(int j=n;j>=i;j--){//0>=1
				System.out.print(c+"\t");
				c-=j-1;//
			}
			System.out.println();
			count--;//10
		}
	}
}

/*

15	
14	10	
13	9	6	
12	8	5	3	
11	7	4	2	1
_

*/