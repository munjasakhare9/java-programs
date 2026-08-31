class Demo implements Static_Interface{
	public void m1(){
		System.out.println("m1 meyhod of Demo");
	}
	public void food(){
		Static_Interface.super.food();
		System.out.println("food method of Demo");
	}
}