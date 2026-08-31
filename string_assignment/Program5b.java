class Program5b{
	public static void main(String args[]){
		String s1="International";
		int countVowels=s1.replaceAll("(?i)[^aeiou]","").length();
		int countConsonants=s1.replaceAll("(?i)[aeiou]","").length();
		System.out.println("count of Vowels :- "+countVowels+" count of Consonants :- "+countConsonants);
	}
}