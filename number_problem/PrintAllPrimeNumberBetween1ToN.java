class PrintAllPrimeNumberBetween1ToN{
	public static void main(String args[]){
		int n=50;
		if(n>=2){
			System.out.print(2+" ");
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
				System.out.print(start+" ");
			}
			start+=2;
		}
	}
}