class MainClass{
	public static void main(String args[]){
		System.out.println("program started..");
		int a=10;
		int b=0;
		int c=0;
		try{
			c=a/b;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("c="+c);
		System.out.println("Program ended..");
	}
}