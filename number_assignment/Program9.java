class Program9{
	public static void main(String args[]){
		int num=13689453;
		int temp=num;
		int max=Integer.MIN_VALUE;
		while(temp!=0){
			int digit=temp%10;
			if(max<digit){
				max=digit;
			}
			temp/=10;
		}
		System.out.println(num+" max digit is :- "+max);
	}
}