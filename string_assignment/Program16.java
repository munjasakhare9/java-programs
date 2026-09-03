class Program16{
	public static void main(String args[]){
		String s1="hello";
		String s2="hello";
		for(int i=0;i<s1.length() && i<s2.length();i++){
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1==ch2){
				if(i==s1.length()-1 || i==s2.length()){
					System.out.println(s1.substring(0,i+1));
					return;
				}
			}
			else if(ch1!=ch2 && i!=0){
				System.out.println(s1.substring(0,i+1));
				return;
			}
			else{
				break;
			}
		}
		System.out.println("-1");
	}
}