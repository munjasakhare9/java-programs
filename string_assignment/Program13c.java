class Program13c{
	public static void main(String args[]){
		String s1 = "123456";
		if(s1.chars().allMatch(Character::isDigit)){
			System.out.println("String contains only digits");
		}
		else{
			System.out.println("String does not contain only digits");
		}
	}
}