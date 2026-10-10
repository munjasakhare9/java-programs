class Program24{
	public static void main(String args[]){
		String s="Hello";
		char arr[]=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--){
			int index=s.length()-1-i;
			arr[index]=s.charAt(i);
		}
		
		System.out.println(new String(arr));
	}
}