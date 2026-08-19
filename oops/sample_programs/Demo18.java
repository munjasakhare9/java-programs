class Demo18{
	boolean checkPrime(int n){
		boolean b=false;
		if(n==0||n==1){
			b=true;
		}
		else{
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					b=true;
				}
			}
		}
		return !b;
	}
	
	int findNthPrimeNumber(int n){
		int count=0, num=0;
		while(count!=n){
			if(checkPrime(++num)){
				count++;
			}
		}
		return num;
	}
}