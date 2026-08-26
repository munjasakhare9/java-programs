class Program12{
	boolean checkPalindrome(String s, int start, int end){
		if(start>=end) return true;
		if(s.charAt(start)!=s.charAt(end)){
			return false;
		}
		return checkPalindrome(s, start+1, end-1);
	}
	public static void main(String args[]){
		Program12 p=new Program12();
		String s="noon";
		System.out.println(p.checkPalindrome(s, 0, s.length()-1));
	}
}