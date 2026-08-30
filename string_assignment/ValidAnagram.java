class ValidAnagram{
	public static void main(String args[]){
		String s="listen".toLowerCase();
		String t="silent".toLowerCase();
		if(s.length()!=t.length()){
			System.out.println("Not Anagram String:- "+s+" "+t);
			return;
		}
			
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)-'a']++;
		}
		
		for(int i=0;i<t.length();i++){
			arr[t.charAt(i)-'a']--;
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				System.out.println("Not Anagram String:- "+s+" "+t);
				return;
			}
		}
		System.out.println("Anagram String:- "+s+" and "+t);
	}
}