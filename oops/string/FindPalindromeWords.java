class FindPalindromeWords{
	public static void main(String args[]){
		String s1="hello nayan where is nitin and aman";
		//output :- nayan nitin;
		String s2[]=s1.trim().split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length;i++){
			String s3=s2[i];
			int start=0, end=s3.length()-1;
			boolean b=true;
			while(start<end){
				if(s3.charAt(start)!=s3.charAt(end)){
					b=false;
					break;
				}
				start++;
				end--;
			}
			if(b){
				sb.append(s3+" ");
			}
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb+".");
	}
}