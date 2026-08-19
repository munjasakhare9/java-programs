class SwapFirstCharToLast{
	public static void main(String args[]){
		String s1="India";
		String s2="";
		s2+=s1.charAt(s1.length()-1);
		for(int i=0;i<s1.length()-1;i++){
			s2+=s1.charAt(i);
		}
		System.out.println(s2);
	}
}