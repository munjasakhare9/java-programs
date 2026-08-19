class Demo6{
	int appendSumOfDigitAtLast(int n){
		int sum=0;
		int num=n;
		int pow=1;
		int tempsum=0;
		while(n>0){
			sum=sum+n%10;
			n/=10;
		}
		tempsum=sum;
		while(tempsum>0){
			pow=pow*10;
			tempsum/=10;
		}
		return num*pow+sum;
	}
}