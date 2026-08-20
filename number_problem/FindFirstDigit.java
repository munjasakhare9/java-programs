class FindFirstDigit{
	public static void main(String args[]){
		int num=1234;
		int temp=num;
		while(temp>9){
			temp/=10;
		}
		System.out.println(temp);
	}
}