class Demo9{
	int shiftFirstToLast(int n){
		int first=n, length=1;
		while(first>9){
			length*=10;
			first/=10;
		}
		n%=length;
		return n*10+first;
	}
}