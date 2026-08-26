class Demo1{
	int a=10;
	void m1(){
		System.out.println("m1 method Demo1");
	}
	Demo1(){
		this(10);
		System.out.println("Default-constructor of Demo1 called");
	}
	Demo1(int a){
		System.out.println("user-defined constructor of Demo1 called");
	}
}