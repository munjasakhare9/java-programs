class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		try{
			Class c = Class.forName("a.b.c.d.e.Demo");
			a.b.c.d.e.Demo d1=(a.b.c.d.e.Demo) c.newInstance();
			d1.a=10;
			d1.b=20;
			d1.display();
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			System.out.println(e);
		}
		System.out.println("Program ended");
	}
}