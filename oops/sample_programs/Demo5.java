class Demo5{
	int firstAndLastDigit(int n){
		int fd=0;
		int ld=n%10;			
		while(n>0){
			fd=n%10;
			n/=10;
		}
		return fd*10+ld;
	}
}