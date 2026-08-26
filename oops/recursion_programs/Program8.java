class Program8{
	int sum(int n){
		if(n==0){
			return 0;
		}
		return n+sum(n-1);
	}
	public static void main(String args[]){
		Program8 p=new Program8();
		System.out.println(p.sum(3));
	}
}