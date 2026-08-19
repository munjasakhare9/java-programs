class SwapFirstCharToLast3{
	public static void main(String args[]){
		String s1="India";
		StringBuilder sb=new StringBuilder(s1.substring(0,s1.length()-1));
		sb.insert(0,s1.charAt(s1.length()-1));
		System.out.println(sb);
	}
}