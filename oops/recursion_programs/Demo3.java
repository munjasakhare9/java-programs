class Demo3{
	int findFirstDigit(int n){
		if(n<=9){
			return n;
		}
		return findFirstDigit(n/10);
	}
}