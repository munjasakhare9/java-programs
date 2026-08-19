//WAP to shift  first character to last.
class ShiftFirstToLast{
	public static void main(String args[]){
		String s1="INDIA";
		StringBuilder sb=new StringBuilder(s1);
		sb.append(sb.charAt(0));
		sb.deleteCharAt(0);
		System.out.println(sb);
	}
}