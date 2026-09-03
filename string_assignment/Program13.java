class Program13{
	public static void main(String args[]){
		String s1="123456";
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(!Character.isDigit(ch)){
				System.out.println("String does not contains only numeric");
				return;
			}
		}
		System.out.println("String contains only numeric");
	}
}