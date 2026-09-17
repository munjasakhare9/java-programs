class Program19{
	public static void main(String args[]){
		String s1="vishwasharma";
		StringBuilder sb=new StringBuilder();
		int arr[]=new int[26];
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			arr[c-'a']++;
		}
		for(int i=0;i<arr.length;i++){
			while(arr[i]!=0){
				sb.append((char)(i+'a'));
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}