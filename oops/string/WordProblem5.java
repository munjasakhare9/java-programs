class WordProblem5{
	public static void main(String args[]){
		String s1="hello i am java developer";
		StringBuilder sb=new StringBuilder();
		sb.append(s1.replaceAll("(?i)[ aeiou]",""));
		sb.append(s1.replaceAll("(?i)[^aeiou]",""));
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==' '){
				sb.insert(i," ");
			}
		}
		System.out.println(sb);
	}
}