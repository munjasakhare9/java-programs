class Demo3{
	int sumOfDigit(int n){
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			n/=10;
		}
		return sum;
	}
}