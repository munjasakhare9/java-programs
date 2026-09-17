class Program20b{
	public static void main(String args[]){
		String s1="nayan";
		char replace='n';
		char replaceWith='m';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c==replace){
				sb.append(replaceWith);
			}
			else{
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}