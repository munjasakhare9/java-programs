class Program2{
	void printOneToN(int i,int n){
		if(i>n){
			return;
		}
		System.out.println(i);
		printOneToN(++i,n);
	}
	public static void main(String args[]){
		Program2 p=new Program2();
		p.printOneToN(1,5);
	}
}