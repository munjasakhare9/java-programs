class Program65{
	public static void main(String args[]){
		int n=6;
		int count=1;
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//5
			for(int j=n;j>=i;j--){//0>=1
				System.out.print(c+"\t");
				c+=j-1;//15+1-1=15
			}
		System.out.println();
		count++;//6
		}
	}
}

/*

1	
2	6	
3	7	10	
4	8	11	13	
5	9	12	14	15
_
*/