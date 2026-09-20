class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		try{
			B b=(B)new A();
		}
		catch(ClassCastException e){
			System.out.println(e);
		}
		
		System.out.println("Program ended..");
	}
}