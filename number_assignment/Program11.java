class Program11{
	public static void main(String args[]){
		int num=13579;
		int temp=num;
		int save=temp%10;
		temp/=10;
		while(temp!=0){
			int digit=temp%10;
			if(digit>=save){
				System.out.println(num+" number are not in strictly increasing order");
				return;
			}
			save=digit;
			temp/=10;
		}
		System.out.println(num+" number are in strictly increasing order");
	}
}