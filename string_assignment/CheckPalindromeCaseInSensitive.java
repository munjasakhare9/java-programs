class CheckPalindromeCaseInSensitive{
	public static void main(String args[]){
		String s1="Nayan";
		String s2=s1.toLowerCase();
		int start=0;
		int end=s2.length()-1;
		while(start<end){
			if(s2.charAt(start)!=s2.charAt(end)){
				System.out.println(s1+" is not a Palindrome String");
				return;
			}
			start++;
			end--;
		}
		System.out.println(s1+" is a Palindrome String");
	}
}