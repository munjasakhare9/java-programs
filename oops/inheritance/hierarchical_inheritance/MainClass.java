class MainClass{
	public static void main(String argws[]){
		Parent p=new Parent();
		p.paint();
		System.out.println("-------------------------------------");
		GirlChild g=new GirlChild();
		g.paint();
		g.beutiful();
		System.out.println("-------------------------------------");
		BoyChild b=new BoyChild();
		b.paint();
		b.handsome();
		System.out.println("-------------------------------------");
	}
}
