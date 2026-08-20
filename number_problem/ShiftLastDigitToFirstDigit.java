class ShiftLastDigitToFirstDigit{
	public static void main(String args[]){
		int num=1234;
		int temp=num;
		int count=1;
		int sum=temp%10;
		temp/=10;
		while(temp!=0){
			count*=10;
			temp/=10;
		}
		temp=num/10;
		sum=sum*count+temp;
		System.out.println(sum);
	}
}

