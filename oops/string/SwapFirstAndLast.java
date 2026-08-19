class SwapFirstAndLast{
	public static void main(String args[]){
		String s1="INDIA";
		StringBuilder sb=new StringBuilder(s1);
		char temp=sb.charAt(0);
		sb.setCharAt(0,sb.charAt(sb.length()-1));
		sb.setCharAt(sb.length()-1,temp);
		System.out.println(sb);
	}
}