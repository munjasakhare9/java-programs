class SwapFirstCharToLast2{
	public static void main(String args[]){
		String s1="India";
		StringBuilder sb=new StringBuilder();
		sb.append(s1.charAt(s1.length()-1));
		for(int i=0;i<s1.length()-1;i++){
			sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}