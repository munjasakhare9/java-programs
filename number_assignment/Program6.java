class Program6{
	public static void main(String args[]){
		int num=12345;
		int temp=num;
		while(temp>9){
			temp/=10;
		}
		System.out.println("Number :- "+num);
		System.out.println("First Digit :- "+temp);
		System.out.println("Last Digit :- "+num%10);

	}
}