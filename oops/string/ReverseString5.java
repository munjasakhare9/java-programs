class ReverseString5{
	public static String reverseString(String s1){//ABCD
		if(s1==null || s1.length()<=1){
			return s1;
		}
		return reverseString(s1.substring(1))+s1.charAt(0);//DCBA
	}
	
	public static void main(String args[]){
		String s1="ABCD";
		String s2=reverseString(s1);//ABCD
		System.out.println(s2);
	}
}