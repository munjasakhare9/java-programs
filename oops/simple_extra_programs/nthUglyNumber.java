class nthUglyNumber{
	public static void main(String args[]){
		int n=10;
		int arr[]=new int[n+1];
		for(int i=0;i<=arr.length;i++){
			if(i<=1){
				a[i]=1;
			}
			arr[i]=(int)Math.min(i*2,i*3,i*5);