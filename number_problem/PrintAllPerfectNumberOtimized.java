class PrintAllPerfectNumberOtimized{
	public static void main(String args[]){
		
		int n=500;
		for(int num=1;num<=n;num++){
			int sum=1;
			for(int i=2;i*i<=num;i++){
				if(num % i == 0) {
					sum += i;

					if(i != num / i) {//pair
						sum += num / i;
					}
				}
			}
		
			if(num==sum){
				System.out.println(num);
			}
		}
		
	}
}