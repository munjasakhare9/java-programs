class SolveExpression2{
	public static void main(String args[]){
		String s1="10+20+123-30";
		s1=s1.replaceAll("-","+-");
		String s2[]=s1.trim().split("\\+");
		int ans=0;
		for(int i=0;i<s2.length;i++){
			if(s2[i].isEmpty()) continue;
			ans+=Integer.parseInt(s2[i]);
		}
		System.out.println(ans);
	}
}