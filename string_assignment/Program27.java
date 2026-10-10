class Program27{
	static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
	public static void main(String args[]){
		String str="Hello";
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
