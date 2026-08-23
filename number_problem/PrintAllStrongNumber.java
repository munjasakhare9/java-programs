class PrintAllStrongNumber{
	public static void main(String args[]){
		int n=50000;//1,2,145,40585
		int fact[]=new int[10];
		fact[0]=1;
		for(int i=1;i<=9;i++){
			fact[i]=fact[i-1]*i;
		}
		
		for(int num=1;num<=n;num++){
			int sum=0;
			int temp=num;
			while(temp!=0){
				int digit=temp%10;
				sum+=fact[digit];
				temp/=10;
			}
			if(sum==num){
				System.out.println(num);
			}
		}
	}
}