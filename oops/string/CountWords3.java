class CountWords3{
	public static void main(String args[]){
		String s1="hello i am java java develover";
		String s2[]=s1.trim().split("\\s+");
		int count=0;
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		System.out.println(s2.length);
	}
}