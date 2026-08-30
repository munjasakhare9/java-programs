class ReverseString{
	public static void main(String args[]){
		String s1="international";
		char c[] = s1.toCharArray();
		for(int i=0;i<c.length/2;i++){
			char temp=c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		String s2=new String(c);
		System.out.println(s1+" Reverse String :- "+s2);
	}
}