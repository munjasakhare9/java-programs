class StringMethod{
	public static void main(String args[]){
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
		String s1="Hello, i am java developer";
		String s2[]=s1.trim().split("\\s+");
		String s3=String.join(" ",s2);
		System.out.println(s3);
	}
}