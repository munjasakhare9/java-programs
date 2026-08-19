class Demo25{
	long printNumbersThatArePerfectSquareAndCube(long n){
		if(n<=0){
			return -1;
		}
		long num=(long)Math.pow(n,6);
		return num;
	}
}	