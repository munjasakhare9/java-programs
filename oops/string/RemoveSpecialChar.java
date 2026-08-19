class RemoveSpecialChar{
	public static void main(String args[]){
		String s1="where is my cricket bat?, i am looking for a while!!!";
		//output :- where is my cricket bat i am looking for a while
		s1=s1.replaceAll("[^a-zA-Z0-9 ]","");
		System.out.println(s1);
	}
}