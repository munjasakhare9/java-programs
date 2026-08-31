class Program5{
	public static void main(String args[]){
		String s1="International";
		int countVowels=0;
		int countConsonants=0;
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(ch=='A' || ch=='a' || ch=='E' || ch=='e' ||ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u'){
				countVowels++;
			}
			else{
				countConsonants++;
			}
		}
		System.out.println("count of Vowels :- "+countVowels+" count of Consonants :- "+countConsonants);
	}
}