class ReverseString2{
	public static void main(String args[]){
		String s1="international";
		StringBuilder sb=new StringBuilder(s1);
		int start=0;
		int end=sb.length()-1;
		while(start<end){
			char temp=sb.charAt(start);
			sb.replace(start,start+1,String.valueOf(sb.charAt(end)));
			sb.replace(end,end+1,String.valueOf(temp));
			start++;
			end--;
		}
		System.out.println(s1+" Reverse String :- "+sb);
	}
}