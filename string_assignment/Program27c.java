class Program27c{
	static boolean isVowel(char ch) {
		return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
	}
		
	public static void main(String args[]){
		String str="Developer";
		StringBuilder sb=new StringBuilder(str);
		
		int i=0, j=str.length()-1;
		while(i<j){
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(!isVowel(ch1)){
				i++;
			}
			else if(!isVowel(ch2)){
				j--;
			}
			else{
				char temp=ch1;
				sb.replace(i,i+1,String.valueOf(ch2));
				sb.replace(j,j+1,String.valueOf(temp));
				i++;
				j--;
			}
		}
		
		System.out.println(sb.toString());
	}
}