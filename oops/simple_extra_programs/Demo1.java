class Demo1{
	int getFactorial(int n){
		if(n==1){
			return n;
		}
		return n*getFactorial(n-1);
	}
}