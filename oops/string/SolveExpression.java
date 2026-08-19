class SolveExpression{
	public static void main(String args[]){
		String s1="10-10+20+30-20-10";
		s1=s1.replaceAll("-","+-");
		String s2[]=s1.trim().split("\\+");
		int sum=0;
		for(int i=0;i<s2.length;i++){
			sum+=Integer.parseInt(s2[i]);
		}
		System.out.println(sum);
	}
}