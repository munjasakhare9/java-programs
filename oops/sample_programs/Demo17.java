class Demo17{
	boolean checkPalindrome(int n){
		int sum=0,temp=n;
		while(temp!=0){
			sum*=10;
			sum+=temp%10;
			temp/=10;
		}
		return sum==n;
	}
	int findNthNumberPalindrome(int n){
		int num=0, count=0;
		while(count!=n){
			if(checkPalindrome(++num)){
				count++;
			}
		}
		return num;
	}
}