class ShiftFirstCharToLast{
	public static void main(String args[]){
		String s1="INDIA";
		String s2=s1.substring(1);
		s2=s2.concat(String.valueOf(s1.charAt(0)));
		System.out.println(s2);
	}
}