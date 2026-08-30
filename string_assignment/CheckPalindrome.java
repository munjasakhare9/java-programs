class CheckPalindrome{
	public static void main(String args[]){
		String s1="nayan";
		int start=0;
		int end=s1.length()-1;
		while(start<end){
			if(s1.charAt(start)!=s1.charAt(end)){
				System.out.println(s1+" is Not a Palindrome");
				return;
			}
			start++;
			end--;
		}
		System.out.println(s1+" is a Palindrome String");
	}
}