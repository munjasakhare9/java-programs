class WordProblem3{
	public static void main(String args[]){
		String s1="hello i am java developer";
		StringBuilder sb=new StringBuilder();
		String s2[]=s1.trim().split("\\s+");
		for(int i=0;i<s2.length-1;i++){
			for(int j=0;j<s2.length-1-i;j++){
				if(s2[j+1].length() < s2[j].length()){
					String temp=s2[j];
					s2[j]=s2[j+1];
					s2[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<s2.length;i++){
			sb.append(s2[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}
}