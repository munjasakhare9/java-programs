class Program16{
	public static void main(String args[]){
		int num=123456789;
		int temp=num;
		int sum=0;
		int count=0;
		while(temp!=0){
			int digit=temp%10;
			sum+=digit;
			count++;
			temp/=10;
		}
		System.out.println(num+" average of all digits :- "+sum/count);
	}
}