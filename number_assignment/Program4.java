class Program4{
	public static void main(String args[]){
		int num=-12345;
		int temp=num;
		int sum=0;
		while(temp!=0){
			int digit=temp%10;
			sum+=digit;
			temp/=10;
		}
		System.out.println("Sum of digit is :- "+sum);
	}
}