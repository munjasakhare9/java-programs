class Program13b{
	public static void main(String args[]){
		String s1="1234567";
		if(s1.matches("\\d+")){
			System.out.println("String cotains only digits");
		}
		else{
			System.out.println("String does not contain only digits");
		}
	}
}