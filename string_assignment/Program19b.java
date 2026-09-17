class Program19b{
	public static void main(String args[]){
		String s1="AaAbBcBdCCddd";
		StringBuilder sb=new StringBuilder();
		int arr1[]=new int[26];
		int arr2[]=new int [26];
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(Character.isLowerCase(c)){
				arr1[c-'a']++;
			}
			else if(Character.isUpperCase(c)){
				arr2[c-'A']++;
			}
		}
		
		for(int i=0;i<arr2.length;i++){
			while(arr2[i]!=0){
				sb.append((char)(i+'A'));
				arr2[i]--;
			}
		}
		
		for(int i=0;i<arr1.length;i++){
			while(arr1[i]!=0){
				sb.append((char)(i+'a'));
				arr1[i]--;
			}
		}
		
		System.out.println(sb);
	}
}