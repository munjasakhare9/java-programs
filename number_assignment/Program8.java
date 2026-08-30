class Program8{
	public static void main(String args[]){
		int num=1234567;
		int temp=num;
		int odd=0;
		int even=0;
		while(temp!=0){
			int digit=temp%10;
			if(digit%2!=0){
				odd++;
			}
			else{
				even++;
			}
			temp/=10;
		}
		System.out.println(num+" odd digit :- "+odd+" even digit :- "+even);
	}
}