class SortString2{
	public static void main(String args[]){
		String s1="International";
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length-1;i++){
			for(int j=0;j<c.length-1-i;j++){
				if(c[j]>c[j+1]){
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		String s2=new String(c);
		System.out.println(s2);
	}
}