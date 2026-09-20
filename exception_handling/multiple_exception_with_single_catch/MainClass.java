class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		String s1[]={"123","222","111","100","124A"};
		int value=0;
		try{
			value=Integer.parseInt(s1[2].substring(1));;
		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException | NumberFormatException e){
			System.out.println("common catch block called");
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("Program ended..");
	}
}