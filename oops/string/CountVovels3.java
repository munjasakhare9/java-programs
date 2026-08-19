class CountVovels3{
	public static void main(String args[]){
		String s1="International";
		String s2="AEIOUaeiou";
		int count=0;
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(s2.contains(String.valueOf(c))){
				count++;
			}
		}
		System.out.println(count);
	}
}