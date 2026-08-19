class Demo1{
	void printNtoOne(int n){
		if(n<1){
			return;
		}
		System.out.println(n);
		printNtoOne(n-1);
	}
}