class Program21{
	public static void main(String args[]){
		int num=7;
		if(num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				System.out.println(num+" is not a prime number");
				return;
			}
		}
		System.out.println(num+" is a prime number");
	}
}