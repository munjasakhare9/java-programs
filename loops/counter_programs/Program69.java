class Program69{
	public static void main(String args[]){
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--){//
			int c=count;//6
			int p=i;//
			for(int j=i;j<=n;j++){//
				System.out.print(c+"\t");
				c-=p;//
				p++;//
			}
			System.out.println();
			count+=i;//
			
		}
	}
}

/*



*/