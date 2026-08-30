class Program3{
	public static void main(String args[]){
		int num=0;
		int count=0;
		if(num==0){
			System.out.println(1+" digits in number "+num);
			return;
		}
		int temp=num;
		while(temp!=0){
			count++;
			temp/=10;
		}
		System.out.println(count+" digits in number "+num);
	}
}