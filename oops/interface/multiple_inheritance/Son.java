class Son implements IndianMother,BritishMother{
	public void food(){
		System.out.println("food method of Son called");
		IndianMother.super.food();
		BritishMother.super.food();
	}
}