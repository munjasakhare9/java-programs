class CheckPerfectNumberOtimized{
	public static void main(String args[]){
		int num=28;//6,28,496,8128,33550336
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
			System.out.println(num+" is Perfect Number.");
		}
		else{
			System.out.println(num+" is not Perfect Number.");
		}
	}
}