class Program18b{
	public static void main(String args[]){
		String s = "ababab";
		boolean flag = true;
		for (int i = 2; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i % 2)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}