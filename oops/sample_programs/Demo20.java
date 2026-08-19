class Demo20{
	boolean checkArmstrongNumber(int n){
		if(n<0){
			return false;
		}
		if(n<=9){
			return true;
		}
		int sum,temp,count;
		sum=0;
		temp=n;
		count=0;
		while(temp!=0){
			temp/=10;
			count++;
		}
		temp=n;
		while(temp!=0){
			int d=temp%10;
			sum+=(int)Math.pow(d,count);
			temp/=10;
		}
		return sum==n;
	}
}