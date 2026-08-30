class Program2{
	public static void main(String args[]){
		int num=121;
		int temp=num;
		int res=0;
		while(temp!=0){
			int digit=temp%10;
			res=res*10+digit;
			temp/=10;
		}
		if(num==res){
			System.out.println(num+" is Palindrome Number");
		}
		else{
			System.out.println(num+" is not Palindrome Number");
		}
	}
}