class CheckStrongNumberOptimized{
	public static void main(String args[]){
		int num=40585;//1,2,145,40585
		int fact[]=new int[10];
		fact[0]=1;
		for(int i=1;i<=9;i++){
			fact[i]=fact[i-1]*i;
		}
		//System.out.println(java.util.Arrays.toString(fact));
		
		int temp=num;
		int sum=0;
		while(temp!=0){
			int digit=temp%10;
			sum+=fact[digit];
			temp/=10;
		}
		if(sum==num){
			System.out.println(num+" is a Strong Number.");
		}
		else{
			System.out.println(num+" is a not Strong Number.");
		}
	}
}