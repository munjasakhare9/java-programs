class Demo7{
	int sum=0;
	int findMaxDigit(int n){//1432
		if(n==0){
			return n;
		}			
		int digit=n%10;//
		if(sum<digit){
			sum=digit;
		}
		findMaxDigit(n/10);
		return sum;
	}
}