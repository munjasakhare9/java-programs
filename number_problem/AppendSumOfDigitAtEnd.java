class AppendSumOfDigitAtEnd{
	public static void main(String args[]){
		int num=1234;
		int sum=0;
		int temp=num;
		int count=1;
		while(temp!=0){
			sum+=temp%10;
			temp/=10;
		}
		int tempsum=sum;
		while(tempsum!=0){
			count*=10;
			tempsum/=10;
		}
		sum=num*count+sum;
		System.out.println(sum);
	}
}