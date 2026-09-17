class Program21c{
	public static int strStr(String haystack, String needle){
		if(needle.length() == 0){
			return 0;
		}
		for(int i=0;i<=haystack.length()-needle.length();i++){//11-3=8---//8
			int j=0;
			while(j<needle.length() && needle.charAt(j)==haystack.charAt(i+j)){//2<3&&
				j++;
			}
			if(j==needle.length()){
				return i;
			}
		}
		return -1;
	}		
	public static void main(String args[]){
		System.out.println(strStr("leetcode", "leet"));
		System.out.println(strStr("happybutsad","sad"));
	}
}