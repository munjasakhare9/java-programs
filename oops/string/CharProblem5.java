class CharProblem5{
	public static void main(String args[]){
		String s1="-10+20+30-20-10";
		s1=s1.replaceAll("-","+-");
		String s2[]=s1.split("\\+");
		int sum=0;
		System.out.println(java.util.Arrays.toString(s2));
		for(int i=0;i<s2.length;i++){
			
			if(i==0 && s2[i].isEmpty()){
				continue;
			}
			sum+=Integer.parseInt(s2[i]);
		}
		System.out.println(sum);
	}
}