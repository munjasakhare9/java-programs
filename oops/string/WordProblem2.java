class WordProblem2{
	public static void main(String args[]){
		String s1="hello i am java developer";
		String s2[]=s1.trim().split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++){
			
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}
}