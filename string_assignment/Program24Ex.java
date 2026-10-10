class Program24Ex{
	public static void main(String args[]){
		String s="Hello";
		char arr[]=new char[s.length()];
		int index = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[index++] = s.charAt(i);
		}
		
		System.out.println(new String(arr));
	}
}