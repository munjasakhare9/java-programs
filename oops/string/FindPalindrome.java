class FindPalindrome{
	public static void main(String args[]){
		String s1="never odd or even";
		s1=s1.replaceAll("\\s+","");
		int start=0, end=s1.length()-1;
		boolean b=true;
		while(start<end){
			if(s1.charAt(start)!=s1.charAt(end)){
				b=false;
				break;
			}
			start++;
			end--;
		}
		if(b){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
}