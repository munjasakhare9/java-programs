class Demo29{
	boolean checkPrime(int n){
		int root=(int)Math.sqrt(n);
		if(n<2){
			return false;
		}
		else if(n==2){
			return true;
		}
		else if(n%2==0){
			return false;
		}
		for(int i=3;i<=root;i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	boolean reversePrime(int n){
		int rev=0, temp=n;
		while(temp!=0){
			rev*=10;
			rev=rev+temp%10;
			temp/=10;
		}
		return checkPrime(rev);
	}
	boolean checkTwistedPrime(int n){
		return checkPrime(n)&&reversePrime(n);
	}
	int findNthTwistedPrimeNumber(int n){
		int count=0,num=1;
		while(count!=n){
			if(checkTwistedPrime(++num)){
				count++;
			}
		}
		return num;
	}
}
