class AppendOneNumberToAnother{
	public static void main(String argsp[]){
		int num1=123;
		int num2=234;
		int temp=num1;
		int count=1;
		while(temp!=0){
			count*=10;
			temp/=10;
		}
		count=num1*count+num2;
		System.out.println(count);
	}
}