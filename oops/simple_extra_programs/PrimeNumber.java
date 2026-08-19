class PrimeNumber{
	public static void main(String args[]){
		int n=0;
		boolean b=true;
		for(int i=2;i*i<=n;i++){
			if(n%i==0){
				b=false;
			}
		}
		if(b){
			System.out.println("It is prime number");
		}
		else{
			System.out.println("It is not prime Number");
		}
	}
}