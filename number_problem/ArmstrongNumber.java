class ArmstrongNumber{
	public static void main(String args[]){
		int num=0000;
		int temp=num;
		int count=0;
		int sum=0;
		if(num==0){
			System.out.println(num+" is an aArmstrong Number.");
			return;
		}
		while(temp!=0){
			count++;
			temp/=10;
		}
		temp=num;
		while(temp!=0){
			int digit=temp%10;
			sum=sum+(int)Math.pow(digit,count);
			temp/=10;
		}
		if(num==sum){
			System.out.println(num+" is an Armstrong Number.");
		}
		else{
			System.out.println(num+" is not an Armstrong Number.");
		}
	}
}