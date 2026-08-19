class Program66{
	public static void main(String args[]){
		int n=5;
		int count=n;//5
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//1
			for(int j=n;j>=i;j--){//0>=1
				System.out.print(c+"\t");
				c+=j;//15+1=16
			}
			System.out.println();
			count--;//0
		}
	}
}

/*

5	
4	9
3	8	12	
2	7	11	14	
1	6	10	13	15	
_

*/