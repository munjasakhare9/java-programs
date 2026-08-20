class FindSecondDigit{
	public static void main(String args[]){
		int num=1234;
		int temp=num;
		while(temp>99){
			temp/=10;
		}
		System.out.println(temp%10);
	}
}