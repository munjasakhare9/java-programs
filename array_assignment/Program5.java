class Program5{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,9,6,7,8,9};
		for(int i=0;i<arr.length-1;i++){
			if(!(arr[i]<=arr[i+1])){
				System.out.println("Array is not sorted..");
				return;
			}
		}
		System.out.println("Array is sorted..");
	}
}