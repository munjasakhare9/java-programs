class MainClass{
	public static void main(String args[]){
		String s1="djkwofj";
		int size=0;
		try{
			size=s1.length();
		}catch(NullPointerException e){
		}
		System.out.println("size="+size);
		System.out.println("Program ended..");
	}
}