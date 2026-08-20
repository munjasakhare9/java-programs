class SecondLastDigit{
	public static void main(String args[]){
		int num=12345;
		int temp=num%100;//temp/=10; temp=temp%10;
		temp/=10;
		System.out.println(temp);
	}
}