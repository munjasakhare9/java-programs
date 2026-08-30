class Program7{
	public static void main(String args[]){
		int num=12345;
		int temp=num;
		int sum=0;
		while(temp>9){
			temp/=10;
		}
		sum=temp+num%10;
		System.out.println(num+" Sum of First and Last Digit is :- "+sum);
	}
}