class MainClass{
	public static void main(String args[]){
		MyDemo m=new MyDemo();
		m.m1();
		m.m2();
		m.setterA(100);
		m.setterB(200);
		System.out.println(m.getterA());
		System.out.println(m.getterB());
	}
}