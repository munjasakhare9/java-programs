class ShiftLastToFirst{
	public static void main(String args[]){
		String s1="INDIA";
		StringBuilder sb=new StringBuilder();
		int len=s1.length()-1;
		sb.append(s1.charAt(len));
		sb.append(s1);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}