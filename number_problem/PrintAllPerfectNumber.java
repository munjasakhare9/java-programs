class PrintAllPerfectNumber{
	public static void main(String args[]){
		int n=50;
		for(int num=1;num<=n;num++){
			int sum=0;
			for(int i=1;i<=num/2;i++){
				if(num%i==0){
					sum+=i;
				}
			}
			if(num==sum){
				System.out.print(num+" ");
			}
		}
	}
}