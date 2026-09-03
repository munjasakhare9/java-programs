class Program11c{
	public static void main(String args[]){
		String s1=" hello i						java developer 		";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
		}
		System.out.println(sb);
	}
}