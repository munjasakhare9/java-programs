class Demo26{
	
	//check prime number
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
	//check palindrome number 
	
	boolean checkPalindrome(int n){
		if(n<0){
			return false;
		}
		if(n<=9){
			return true;
		}
		int sum=0, temp=n;
		while(temp!=0){
			int d=temp%10;
			sum=sum*10+d;
			temp/=10;
		}
		return sum==n;
	}
	boolean checkPalindromicPrimeNumber(int n){
		//boolean prime=checkPrime(n);
		//boolean palindrome=checkPalindrome(n);
		//return prime==true && palindrome==true;
		return checkPrime(n)&&checkPalindrome(n);
	}
}