class Program26{
	public static void main(String args[]){
		String str="Happynewyear2026";
		char arr[] = str.toCharArray();
		int i=0, j=arr.length-1;
		while(i<j){
			while(i<j && !Character.isLetter(arr[i])){
				i++;
			}
			
			while(i<j && !Character.isLetter(arr[j])){
				j--;
			}
			
			if(i<j){
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