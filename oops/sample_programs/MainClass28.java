class MainClass28{
	public static void main(String args[]){
		Demo28 d1=new Demo28();
		int n=20;
		int count=0, num=1;
		while(count!=n){
			if(d1.findNthPalindromicPrimeNumber(++num)){
				count++;
			}
		}
		System.out.println(n+"th Palindromic Prime Number is :- "+num);
		
		/*for(int i=1;i<=n;i++){
			if(d1.findNthPalindromicPrimeNumber(i)){
				System.out.println(i);
			}
		}*/
	}
}