class Demo8{
	int shiftLastToFirst(int n){
		int ld=n%10;
		int temp=n/10;
		int fd=0;
		while(temp!=0){
			ld*=10;
			temp/=10;
		}
		n/=10;
		return ld+n;
	}
}