class BinarySearchUsingRecursion{
	public static void main(String args[]){
		int a[]={10,20,30,40,50,60,70,90,100,120,130,150};
		int key=90;
		int index=binarySearch(a, key, 0, a.length-1);
		System.out.println(index);
	}
	private static int binarySearch(int a[], int key, int start, int end){
		if(start<=end){
			int mid=start+(end-start)/2;
			if(key==a[mid]){
				return mid;
			}
			else if(key<a[mid]){
				return binarySearch(a, key, start,mid-1);
			}
			else{
				return binarySearch(a, key, mid+1,end);
			}
		}
		return -1;
	}
}