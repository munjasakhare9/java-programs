class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		String s1="123A";
		int value=0;
		try{
			value=Integer.parseInt(s1);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("program ended..");
	}
}