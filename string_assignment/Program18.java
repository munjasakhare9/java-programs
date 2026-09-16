class Program18{
	public static void main(String args[]){
		String s1="abababa1b";
		char c1=s1.charAt(0);
		char c2=s1.charAt(1);
		boolean odd=true;
		boolean even=true;
		for(int i=2;i<s1.length();i+=2){
			if(c1!=s1.charAt(i%2)){
				even=false;
				break;
			}
		}
		
		for(int i=3;i<s1.length();i+=2){
			if(c1!=s1.charAt(i%2)){
				odd=false;
				break;
			}
		}
		
		if(odd && even){
			System.out.println("all alternate characters in a string are identical");
		}
		else{
			System.out.println("all alternate characters in a string are not identical");
		}
	}
}