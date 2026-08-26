class ThisKeyword{
	int a,b;
	ThisKeyword(){
		this(10,20);
	}
	
	ThisKeyword(int a, int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		//int a=100, b=200;
		System.out.println("a="+a+" b="+b);
	}
}