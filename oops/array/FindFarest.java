class FindFarest{
	public static void getFarest(int arr[],int num){
		int farest=0;
		int ele=-1;
		for(int i=0;i<arr.length;i++){
			int diff=Math.abs(arr[i]-num);
			if(farest<diff){
				farest=diff;
				ele=arr[i];
			}
		}
		System.out.println("Farest Element is :- "+ele);
	}
	public static void main(String args[]){
		int arr[]={1,2,3,9,8,6,7,4,5};
		getFarest(arr,8);
	}
}