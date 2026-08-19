class Demo11{
	int findMaxDigit(int n){
		int max=0;
		while(n>0){
			int d=n%10;
			if(max<d){
				max=d;
			}
			n/=10;
		}
		return max;
	}
}