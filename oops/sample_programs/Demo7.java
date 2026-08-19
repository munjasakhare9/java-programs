class Demo7{
	int appendSumOfDigitAtFirst(int n){
		int sum=0;
		int num=n;
		int pow=1;
		int tempnum=0;
		while(n>0){
			sum=sum+n%10;
			n/=10;
		}
		tempnum=num;
		while(tempnum>0){
			pow=pow*10;
			tempnum/=10;
		}
		return sum*pow+num;
	}
}