class PrintAllArmstrongNumber{
	public static void main(String args[]){
		int n=200;
		for(int num=1;num<=n;num++){
			int count=0;
			int temp=num;
			while(temp!=0){
				count++;
				temp/=10;
			}
			temp=num;
			int sum=0;
			while(temp!=0){
				int digit=temp%10;
				sum+=(int)Math.pow(digit,count);
				temp/=10;
			}
			if(num==sum){
				System.out.print(num+" ");
			}
		}
	}
}