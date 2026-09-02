class Program12{
	public static void main(String args[]){
		int num=98321;
		int temp=num;
		int save=temp%10;
		temp/=10;
		while(temp!=0){
			int digit=temp%10;
			if(digit<=save){
				System.out.println("number are not in strictly decreasing order");
				return;
			}
			save=digit;
			temp/=10;
		}
		System.out.println("number are in strictly decreasing order");
	}
}