class Program19{
	public static void main(String args[]){
		int num=12035;
		int temp=num;
		while(temp!=0){
			int digit=temp%10;
			if(digit==0){
				System.out.println(num+" Its a duck number");
				return;
			}
			temp/=10;
		}
		System.out.println(num+" Its not a duck number");
	}
}