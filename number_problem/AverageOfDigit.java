class AverageOfDigit{
	public static void main(String args[]){
		int num=1234;
		float sum=0;
		int count=0;
		int temp=num;
		while(temp!=0){
			sum+=temp%10;
			count++;
			temp/=10;
		}
		System.out.println(sum/count);
	}
}