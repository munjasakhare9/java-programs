class FindLongestWord3{
	public static void main(String args[]){
		String s1="welcome to international airport welcome to international airport";
		String s2[]=s1.trim().split("\\s+");
		int max=0;
		String s3=s2[0];
		for(int i=1;i<s2.length;i++){
			String temp=s2[i];
			if(max<temp.length()){
				max=temp.length();
				s3=temp;
			}
		}
		//System.out.println(s3);
		for(int i=0;i<s2.length;i++){
			if(s2[i].length()==s3.length()){
				System.out.println(s2[i]);
			}
		}
	}
}