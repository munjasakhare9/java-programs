class CountVovels4{
	public static void main(String args[]){
		String s1="Internation";
		String s2=s1.replaceAll("(?i)[^aeiou]","");
		System.out.println(s2.length());
	}
}