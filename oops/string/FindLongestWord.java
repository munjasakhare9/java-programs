class FindLongestWord{
	public static void main(String args[]){
		String s1="hello i am java developer";
		String s2[]=s1.trim().split("\\s+");
		int max=0;
		String s3="";
		for(int i=0;i<s2.length;i++){
			
			if(max<s2[i].length()){
				max=s2[i].length();
				s3=s2[i];
			}
		}
		System.out.println(s3);
	}
}