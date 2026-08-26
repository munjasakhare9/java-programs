class Demo3 extends Demo2{
	int a=30;
	void m1(){
		int a=100;
		System.out.println("m1 method Demo3");
		System.out.println("a="+a);//local-variable
		System.out.println("a="+this.a);//non-local-variable
		System.out.println("a="+super.a);//non-local-variable
		super.m1();
		super.m1();
	}
	Demo3(){
		this(10);
		System.out.println("Default-constructor of Demo3 called");
	}
	Demo3(int a){
		super(10);
		System.out.println("user-defined constructor of Demo3 called");
	}
}