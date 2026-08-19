class Program1{
	public static void main(String args[]){
		String s1="hello i am java developer";
		String s2[]=s1.trim().split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++){
			sb.append(s2[i]+s2[i].length()+" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}