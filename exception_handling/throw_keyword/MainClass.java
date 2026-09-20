class MainClass{
	public static void main(String args[]){
		System.out.println("program started..");
		Site s=new Site();
		try{
			s.login(32);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("program ended..");
	}
}