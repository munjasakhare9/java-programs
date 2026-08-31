class Program8{
	public static void main(String args[]){
		String s1="i am java developer";
		String target="java";
		for(int i=0;i<=s1.length()-target.length();i++){
			if(s1.substring(i, i + target.length()).equals(target)){
				System.out.println("("+target+")"+" is a substring of "+"("+s1+")");
				return;
			}
		}
		System.out.println("("+target+")"+" is not a substring of "+"("+s1+")");
	}
}