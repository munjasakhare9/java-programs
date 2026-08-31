interface Static_Interface{
	int a=10;
	void m1();
	static void display(){
		System.out.println("display method of Static_interface");
	}
	default void food(){
		System.out.println("food-default method of Static_Interface");
	}
}