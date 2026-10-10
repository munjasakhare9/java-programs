class Program26b{
	public static void main(String args[]){
		String str="Happyn@ewy%ear     2026 java";
		char arr[]=str.toCharArray();
		
		int i=0, j=arr.length-1;
		while(i<j){
			if(!Character.isLetter(arr[i])){
				i++;
			}
			else if(!Character.isLetter(arr[j])){
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