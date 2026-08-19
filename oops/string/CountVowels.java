class CountVowels{
	public static void main(String args[]){
		String s1="Digital India";
		int count=0;
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
				count++;
			}
		}
		System.out.println(count);
	}
}