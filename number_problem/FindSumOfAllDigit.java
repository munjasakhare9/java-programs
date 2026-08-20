class FindSumOfAllDigit{
	public static void main(String args[]){
		int num=1234;
		int sum=0;
		int temp=num;
		while(temp!=0){
			sum+=temp%10;
			temp/=10;
		}
		System.out.println(sum);
	}
}