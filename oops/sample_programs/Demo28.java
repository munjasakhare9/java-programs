class Demo28{
	
	boolean checkPrime(int n){
		if(n<=1){
			return false;
		}
		else if(n==2){
			return true;
		}
		else if(n%2==0){
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	boolean checkPalindrome(int n){
		int sum=0, temp=n;
		while(temp!=0){
			sum*=10;
			sum=sum+temp%10;
			temp/=10;
		}
		return sum==n;
	}
	boolean findNthPalindromicPrimeNumber(int n){
		return checkPalindrome(n)&&checkPrime(n);
	}
}