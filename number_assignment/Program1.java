class Program1{
	public static void main(String args[]){
		int num=-12345;
		System.out.println(num);
		int res=0;
		while(num!=0){
			int digit=num%10;
			res=res*10+digit;
			num/=10;
		}
		System.out.println(res);
	}
}

//Important: Java's % operator keeps the sign of the original number, so the negative sign is automatically handled.