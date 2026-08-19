class Program64{
	public static void main(String args[]){
		int n=5;
		int count=(n*(n+1))/2; //15
		for(int i=1;i<=n;i++){//5<=5
			int c=count;//1
			for(int j=i;j>=1;j--){//0>=1
				System.out.print(c+"\t");
				c++;//6
			}
			System.out.println();
			count-=i+1;//
		}
	}
}

/*
15	
13	14	
10	11	12	
6	7	8	9	
1	2	3	4	5	

*/