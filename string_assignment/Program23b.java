class Program23b{
	static int countNumberOfWords(String s1){
		int count=0;
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c!=' ' && i==0 || c!=' ' && s1.charAt(i-1)==' '){
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		String s1="i am java developer since 2020";
		int count=countNumberOfWords(s1);
		System.out.println(count);
	}
}