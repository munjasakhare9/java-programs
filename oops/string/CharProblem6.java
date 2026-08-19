class CharProblem6{
	public static void main(String args[]){
		String s1="10+20+30-10-20";
		int num=0;
		int sign=1;
		int res=0;
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(Character.isDigit(c)){
				num=num*10+(c-'0');
			}
			else{
				res+=sign*num;
				num=0;
				sign=(c=='+')?1:-1;
			}
		}
		res+=sign*num;
		System.out.println(res);
	}
}