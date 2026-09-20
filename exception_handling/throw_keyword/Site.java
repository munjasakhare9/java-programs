class Site{
	public void login(int age){
		System.out.println("welcome to this site..");
		if(age>=70){
			homePage();
		}
		else{
			throw new ArithmeticException();
		}
		System.out.println("thank you for visit..");
	}
	private void homePage(){
		System.out.println("welcome to your second home..");
	}
}