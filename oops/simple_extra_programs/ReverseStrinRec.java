class ReverseStrinRec{
	public static void main(String args[]){
		String str="abc";
		reverseString(str,0);
	}
	private static void reverseString(String str, int index){
		if(index>=str.length()){
			return;
		}
		reverseString(str,index+1);
		System.out.print(str.charAt(index));
	}
}
//