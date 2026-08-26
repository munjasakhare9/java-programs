class MyDemo{
	private int a,b;
	private void display(){
		System.out.println("a="+a+" b="+b);
	}
	//we can access using following code because private has scope within class only.
	/*
	public static void main(String args[]){
		MyDemo m=new MyDemo();
		m.a=100;
		m.b=200;
		m.display();
	}
	*/
}
