class Demo2{
	void printOneToN(int n){
		if(n<1){
			return;
		}
		printOneToN(n-1);
		System.out.println(n);
	}
}