import java.util.Arrays;
class ReverseEachWord2{
	public static void main(String args[]){
		String s1="welcome to international airport";
		StringBuilder sb=new StringBuilder();
		String s2[]=s1.trim().split("\\s+");
		for(int i=0;i<s2.length;i++){
			String temp=new StringBuilder(s2[i]).reverse().toString();
			sb.append(temp);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}
}