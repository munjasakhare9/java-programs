class Program27b{
	static boolean isVowel(char ch) {
       return "aeiou".indexOf(Character.toLowerCase(ch)) != -1;
    }
	public static void main(String args[]){
		String str="ashokit";
		char arr[]=str.toCharArray();
		int i=0, j=arr.length-1;
		while(i<j){
			if(!isVowel(arr[i])){
				i++;
			}
			else if(!isVowel(arr[j])){
				j--;
			}
			else{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
			}
		}
		
		System.out.println(new String(arr));
	}
}
