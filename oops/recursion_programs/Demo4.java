class Demo4{
	int findSecondDigit(int n){
		if(n<=9){
			return -1;
		}
		if(n<=99){
			return n%10;
		}
		return findSecondDigit(n/10);
	}
}