class Demo27{
	boolean checkTwistedPrimeNumber(int n){
		return checkPrime(n)&& reversePrime(n);
	}
	boolean checkPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	boolean reversePrime(int n){
		int rev=0;
		while(n!=0){
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		return checkPrime(rev);
	}
}