class Program3{
	void printNToOne(int i, int n){
		if(n<i){
			return;
		}
		System.out.println(n);
		printNToOne(i,--n);
	}
	public static void main(String args[]){
		Program3 p=new Program3();
		p.printNToOne(1,5);
	}
}