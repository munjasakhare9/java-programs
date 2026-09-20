class MainClass{
	public static void main(String args[]){
		System.out.println("program started..");
		Site s=new Site();
		try{
			s.login(30);
		}
		catch(ClassNotFoundException | InstantiationException e){
			System.out.println(e);
		}
		System.out.println("Program ended..");
	}
}