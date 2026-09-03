class Program14{
	public static void  main(String args[]){
		String s1="Hello i Am java DevelOpeR";
		StringBuilder sb=new StringBuilder(s1);
		for(int i=0;i<sb.length();i++){
			char ch=sb.charAt(i);
			if(ch==Character.toLowerCase(ch)){
				sb.deleteCharAt(i);
				sb.insert(i,Character.toUpperCase(ch));
			}
			else if(ch==Character.toUpperCase(ch)){
				sb.deleteCharAt(i);
				sb.insert(i,Character.toLowerCase(ch));
			}
		}
		System.out.println(sb);
	}
}