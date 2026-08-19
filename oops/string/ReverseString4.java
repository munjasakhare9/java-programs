class ReverseString4{
	public static void main(String args[]){
		String s1="Computer";
		char c[]=s1.toCharArray();
		int i=0, j=s1.length()-1;
		while(i<j){
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		String s2=new String(c);
		System.out.println(s2);
	}
}