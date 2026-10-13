class Program29{
	public static void main(String args[]){
		String str="AZ";
		int columnNumber=0;
		int power=1;
		for(int i=str.length()-1;i>=0;i--){
			int ch=str.charAt(i)-'A'+1;
			columnNumber+=ch*power;
			power*=26;
		}
		System.out.println("title:: "+columnNumber);
	}
}