class InsertAtVowels2{
	public static void main(String args[]){
		String s1="International";
		String s2="AEIOUaeiou";
		int count=0;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(s2.indexOf(c)!=-1){
				sb.append(++count);
			}
			else{
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}