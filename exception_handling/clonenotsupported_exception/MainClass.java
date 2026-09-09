class MainClass{
	public static void main(String args[]){
		System.out.println("program started");
		DemoClass d1=new DemoClass();
		d1.a=10;
		d1.b=20;
		d1.display();
		DemoClass d2=d1.clone();
		d2.display();
		System.out.println("program ended");
	}
}