class BinarySearch{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,7,8,9,11,15,68,99,100};
		int key=11;
		int index=binarySearch(a,key);
		System.out.println(index);
	}
	private static int binarySearch(int a[],int key){
		int start=0, end=a.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(key==a[mid]){
				return mid;
			}
			else if(key<a[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
		}
		return -1;
	}
}