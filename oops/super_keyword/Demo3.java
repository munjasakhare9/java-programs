class Demo3 extends Demo2{
	int a=30;
	void m1(){
		int a=100;
		System.out.println("m1 method of Demo3.");
		System.out.println("a="+super.a);
		super.m1();
		super.m1();
	}
}