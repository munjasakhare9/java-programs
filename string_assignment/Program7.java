class Program7{
	public static void main(String args[]){
		String s1="programming";
		int arr[]=new int[26];
		for(int i=0;i<s1.length();i++){
			arr[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=2){
				System.out.println((char)(i+'a')+" :- "+arr[i]);
			}
		}
	}
}