class Program10{
	public static void main(String args[]){
		int num=36589412;
		int temp=num;
		int min=Integer.MAX_VALUE;
		while(temp!=0){
			int digit=temp%10;
			if(min>digit){
				min=digit;
			}
			temp/=10;
		}
		System.out.println(num+" Min Digit is :- "+min);
	}
}