class Program15{
	public static void main(String args[]){
		int input=10;
		int num=(input<0)?-input:input;
		int temp=num;
		int last=temp%10;
		int power=1;
		while(temp>9){
			power*=10;
			temp/=10;
		}
		last*=power;
		last+=num%power;
		last/=10;
		last*=10;
		last+=temp;
		if(input<0){
			last=-last;
		}
		System.out.println(input+" Swap the first and last digits :- "+last);
	}
}