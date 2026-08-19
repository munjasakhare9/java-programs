class Demo12{
	
	int separateOddAndEven(int n){//123456
		int odd=0;
		int even=0;
		int pow1=1;
		int pow2=1;
		while(n>0){//1234
			int d=n%10;//4
			if(d%2!=0){
				odd=d*pow2+odd;
				pow2*=10;//10
			}
			else{
				even=d*pow1+even;
				pow1*=10;
			}
			n/=10;
		}
		return odd*pow1+even;
	}
}