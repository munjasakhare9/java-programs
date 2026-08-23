class CheckStrongNumber{
	public static void main(String args[]){
		int num=40585;//1,2,145,
		int sum=0;
		int temp=num;
		while(temp!=0){
			int digit=temp%10;
			int fact=1;
			for(int i=digit;i>=1;i--){
				fact*=i;
			}
			temp/=10;
			sum+=fact;
		}
		if(sum==num){
			System.out.println(num+" is a Strong Number.");
		}
		else{
			System.out.println(num+" is not a Strong Number.");
		}
	}
}