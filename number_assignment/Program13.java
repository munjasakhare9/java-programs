class Program13{
	public static void main(String args[]){
		int num=102030;
		if(num==0){
			System.out.println(num+" Replace all 0 with 5 :- "+5);
			return;
		}
		int temp=num;
		int pow=1;
		int res=0;
		while(temp!=0){
			int digit=temp%10;
			if(digit==0){
				//res=5*pow+res;
				res += 5 * pow;
			}
			else{
				res=digit*pow+res;
			}
			pow*=10;
			temp/=10;
		}
		System.out.println(num+" Replace all 0 with 5 :- "+res);
	}
}