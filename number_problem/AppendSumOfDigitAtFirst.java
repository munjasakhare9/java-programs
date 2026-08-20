class AppendSumOfDigitAtFirst{
	public static void main(String args[]){
		int num=1234;
		int sum=0;
		int temp=num;
		int count=1;
		while(temp!=0){
			sum+=temp%10;
			temp/=10;
		}
		temp=num;
		while(temp!=0){
			count*=10;
			temp/=10;
		}
		sum=sum*count+num;
		System.out.println(sum);
	}
}