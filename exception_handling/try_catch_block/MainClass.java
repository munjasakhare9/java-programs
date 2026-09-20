class MainClass{
	public static void main(String args[]){
		System.out.println("program started..");
		int a=10;
		int b=0;
		int c=0;
		try{
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Program ended..");
	}
}