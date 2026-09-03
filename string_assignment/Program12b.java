class Program12b{
	public static void main(String args[]){
		String s1="International";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if("aeiouAEIOU".indexOf(ch)==-1){
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}