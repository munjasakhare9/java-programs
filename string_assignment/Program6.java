class Program6{
	public static void main(String args[]){
		String s1="leetcodel";
		int arr[]=new int[26];
		int len=s1.length();
		for(int i=0;i<len;i++){
			arr[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<len;i++){
			if(arr[s1.charAt(i)-'a']==1){
				System.out.println(s1.charAt(i)+" index is :- "+i);
				return;
			}
		}
		System.out.println(-1);
	}
}