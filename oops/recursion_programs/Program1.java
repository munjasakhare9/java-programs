class Program1{
	void printName(int n){
		if(1>n){
			return;
		}
		System.out.println("Raj");
		printName(--n);
	}
	public static void main(String args[]){
		Program1 p=new Program1();
		p.printName(5);
	}
}