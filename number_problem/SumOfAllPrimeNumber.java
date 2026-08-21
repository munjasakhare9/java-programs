class SumOfAllPrimeNumber{
	public static void main(String args[]){
		int n=20;
		int sum=0;
		if(n>=2){
			sum=2;
		}
		int start=3;
		while(start<=n){
			boolean isPrime=true;
			for(int i=3;i*i<=start;i+=2){
				if(start%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				sum+=start;
			}
			start+=2;
		}
		System.out.println("Sum of Prime number between 1 to "+n+" is :- "+sum);
	}
}