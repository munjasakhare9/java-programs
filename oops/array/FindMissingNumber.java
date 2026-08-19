class FindMissingNumber{
	public static void main(String args[]){
		int a[]={1,2,3,6,8,9,10,15};
		for(int i=1;i<a.length;i++){
			int diff=a[i]-a[i-1];
			if(diff>1){
				while(a[i-1]<a[i]-1){
					System.out.print(++a[i-1]+" ");
				}
			}
		}
	}
}