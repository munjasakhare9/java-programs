class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		String s1="hello";
		String s2=null;
		try{
			s2=s1.substring(10);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println(s2);
		System.out.println("program ended..");
	}
}