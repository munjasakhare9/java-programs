class Program22{
	public static void main(String args[]){
		String s1="thequickbrownfoxjumpsoverthelazydog";
		boolean arr[]=new boolean[26];
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			arr[c-'a']=true;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==false){
				System.out.println("Not a Valid Pangram");
				return;
			}
		}
		System.out.println("Valid Pangram");
	}
}