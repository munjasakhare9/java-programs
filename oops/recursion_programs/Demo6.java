class Demo6{
	int factorialOfNumber(int n){
		if(n==1){
			return n;
		}
		return n*factorialOfNumber(n-1);
	}
}