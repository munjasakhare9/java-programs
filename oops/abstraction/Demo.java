abstract class Demo{
	protected int a, b;
	void m1(){
		System.out.println("Method m1 of Demo ..");
	}
	abstract void m2();

	abstract public void setterA(int a);
	abstract public void setterB(int b);
	abstract public int getterA();
	abstract public int getterB();
}