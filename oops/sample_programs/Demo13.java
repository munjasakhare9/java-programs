class Demo13{
	int replaceZerosAtOddDigit(int n){
		int res=0;
		int power=1;
		while(n!=0){//1
			int d=n%10;
			if(d%2!=0){//4
				res=0*power+res;
				power*=10;
			}
			else{
				res=d*power+res;
				power*=10;
			}
			n/=10;
		}
		return res;
	}
}