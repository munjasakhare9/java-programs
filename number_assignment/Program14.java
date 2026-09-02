class Program14{
	public static void main(String args[]){
		int num=123456789;
		int temp=num;
		int newNum=0;
		int power=1;
		
		while(temp!=0){
			int digit=temp%10;
			if((digit&1)==0){//digit%2==0
				newNum+=digit*power;
				power*=10;
			}
			temp/=10;
		}
		System.out.println(num+" removed all odd digits and create new number :- "+newNum);
	}
}