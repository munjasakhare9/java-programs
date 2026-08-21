class PrintNPrimeNumber{
	public static void main(String args[]){
		int num=50;
		int count=1;
		System.out.print(2+" ");
		int n=3;
		while(count<num){
			boolean isPrime=true;
			for(int i=3;i*i<=n;i+=2){
				if(n%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.print(n+" ");
				count++;
			}
			n+=2;
		}
	}
}