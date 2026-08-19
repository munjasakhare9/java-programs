class InsertAtVowels{
	public static void main(String args[]){
		String s1="International";
		int count=1;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u'){
				sb.append(count++);
			}
			else{
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}