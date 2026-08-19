class Demo4{
	int avgOfDigit(int n){
		int count=0;
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			count++;
			n/=10;
		}
		return sum/count;
	}
}