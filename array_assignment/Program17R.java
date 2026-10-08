class Program17R{
	
	public static int binarySearch(int arr[], int key, int start, int end){
		if(start>end){
			return -1;
		}
		int mid=start+(end-start)/2;
		if(key == arr[mid]){
			return mid;
		}
		else if(key < arr[mid]){
			return binarySearch(arr, key, start, mid-1);
		}
		else{
			return binarySearch(arr, key, mid+1, end);
		}
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr, 7, 0, arr.length-1));
	}
}