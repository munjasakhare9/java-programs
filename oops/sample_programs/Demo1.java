class Demo1{
	int firstDigit(int n){
		int d=0;
		while(n>0){
			d=n%10;
			n/=10;
		}
		return d;
	}
}