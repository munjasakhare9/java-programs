class Demo2 extends Demo1{
	int a=20;
	void m1(){
		System.out.println("m1 method Demo2");
	}
	Demo2(){
		super();
		System.out.println("Default-constructor of Demo2 called");
	}
	Demo2(int a){
		System.out.println("user-defined constructor of Demo2 called");//
	}
}