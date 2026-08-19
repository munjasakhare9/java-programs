class Demo5{
	int sumOfN(int n){
		if(n==1){
			return n;
		}
		return n+sumOfN(n-1);
	}
}