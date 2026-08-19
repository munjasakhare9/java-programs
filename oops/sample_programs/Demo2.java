class Demo2{
	int secondDigit(int n){
		int d=0;
		while(n>9){
			d=n%10;
			n/=10;
		}
		return d;
	}
}