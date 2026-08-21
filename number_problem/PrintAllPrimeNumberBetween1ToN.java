class PrintAllPrimeNumberBetween1ToN{
	public static void main(String args[]){
		int num=50;
		int count=0;
		int n=2;
		while(count!=num){
			boolean b=true;
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					b=false;
					break;
				}
			}
			if(b){
				System.out.print(n+" ");
				count++;
			}
			n++;
		}
	}
}