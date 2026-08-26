class Program11{
	void reverse(int a[],int start, int end){
		if(start>=end){
			return;
		}
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
		reverse(a,start+1,end-1);
	}
	public static void main(String args[]){
		Program11 p=new Program11();
		int a[]={1,2,3,4,2};
		p.reverse(a,0,a.length-1);
		System.out.println(java.util.Arrays.toString(a));
	}
}