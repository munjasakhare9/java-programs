class Program71{
	public static void main(String args[]){
		int n=5;
		int count=((n*(n+1))/2)-(n-1);//11
		for(int i=n;i>=1;i--){//0>=1
			int c=count;//1
			for(int j=i;j<=n;j++){//6<=5
				System.out.print(c+"\t");
				c+=j+1;//
			}
			System.out.println();
			count-=i-1;//1-0=1
		}
	}
}

/*

11	
7	12	
4	8	13	
2	5	9	14	
1	3	6	10	15	
-

*/