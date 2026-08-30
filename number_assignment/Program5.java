class Program5{
	public static void main(String args[]){
		int num=12345;
		int temp=num;
		int product=1;
		while(temp!=0){
			int digit=temp%10;
			product*=digit;
			temp/=10;
		}
		System.out.println(num+" Product of Digits is :- "+product);
	}
}