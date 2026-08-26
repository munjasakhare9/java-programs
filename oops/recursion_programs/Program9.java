class Program9{
	int sum(int a[], int i){
		return (i == a.length-1)? a[a.length-1]: a[i]+sum(a, i+1);
	}
	public static void main(String args[]){
		Program9 p=new Program9();
		int a[]={10,20,30,40,50};
		System.out.println(p.sum(a,0));
	}
}