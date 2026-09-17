class Program23{
	public static void main(String args[]){
		String s1="i am java developer";
		s1=s1.trim();
		if(s1.length()==0){
			System.out.println(0);
			return;
		}
		String arr[]=s1.split("\\s+");
		System.out.println(arr.length);
	}
}