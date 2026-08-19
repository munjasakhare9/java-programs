import java.util.Arrays;
class ReverseEachWord{
	public static void main(String args[]){
		String s1="welcome to international airport";
		String s2[]=s1.trim().split("\\s+");
		for(int i=0;i<s2.length;i++){
			String temp=new StringBuilder(s2[i]).reverse().toString();
			s2[i]=temp;
		}
		s1=Arrays.toString(s2);
		System.out.println(s1);
	}
}