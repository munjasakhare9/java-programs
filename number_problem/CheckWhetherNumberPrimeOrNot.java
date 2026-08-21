class CheckWhetherNumberPrimeOrNot{
	public static void main(String args[]){
		int num=8;
		boolean b=true;
		if(num==0 || num==1){
			System.out.println(num+" Prime Number");
			return;
		}
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				b=false;
			}
		}
		if(b){
			System.out.println(num+" Prime Number");
		}
		else{
			System.out.println(num+" Not Prime Number");
		}
	}
}