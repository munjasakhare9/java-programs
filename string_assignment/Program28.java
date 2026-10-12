class Program28{
	public static void main(String args[]){
		int col=30;
		String str="";
		int temp=col;
		while(temp!=0){
			temp--;
			str=(char)(temp%26+'A')+str;
			temp/=26;
		}
		
		System.out.println(col+"="+str);
	}
}