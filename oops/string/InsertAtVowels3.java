class InsertAtVowels3{
	public static void main(String args[]){
		String s1="International";
		String s2="AEIOUaeiou";
		int count=0;
		StringBuilder sb=new StringBuilder(s1);
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(s2.indexOf(c)!=-1){
				sb.deleteCharAt(i);
				sb.insert(i,++count);
			}
		}
		System.out.println(sb);
	}
}