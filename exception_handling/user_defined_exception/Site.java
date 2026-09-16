class Site{
	public void login(int age){
		System.out.println("welcome to this site");
		if(age>=70){
			homePage();
		}
		else{
			throw new InvalidAgeException("age should be 70 or above");
		}
		System.out.println("thank you for visit");
	}
	
	private void homePage(){
		
}