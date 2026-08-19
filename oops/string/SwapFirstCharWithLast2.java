class SwapFirstCharWithLast2{
	public static void main(String args[]){
		String s1="India";
		char c[]=s1.toCharArray();
		char temp=c[0];
		c[0]=c[c.length-1];
		c[c.length-1]=temp;
		String s2=new String(c);
		System.out.println(s2);
	}
}