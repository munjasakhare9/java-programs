class SwapFirstCharToLast4{
	public static void main(String args[]){
		String s1="India";
		StringBuilder sb=new StringBuilder(s1);
		sb.insert(0,sb.charAt(sb.length()-1));
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}