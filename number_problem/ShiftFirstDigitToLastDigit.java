class ShiftFirstDigitToLastDigit{
	public static void main(String args[]){
		int num=1234;
		int temp=num;
		int count=1;
		int sum=0;
		while(temp>9){
			count*=10;
			temp/=10;
		}
		temp=num%count;
		sum=num/count;
		sum=temp*10+sum;
		System.out.println(sum);
	}
}