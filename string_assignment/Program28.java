class Program28{
	public static void main(String args[]){
		int col=52;//52
		StringBuilder sb=new StringBuilder();
		int temp=col;
		while(temp!=0){
			temp--;
			char ch=(char)('A'+temp%26);
			sb.append(ch);
			temp/=26;
		}
		System.out.println(col+":: "+sb.reverse().toString());
	}
}