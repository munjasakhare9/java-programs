class FindNearest{
	public static void getNearest(int arr[],int num){
		int nearest=Integer.MAX_VALUE;
		int ele=-1;
		for(int i=0;i<arr.length;i++){
			int diff=Math.abs(arr[i]-num);
			if(nearest>diff && arr[i]!=num){
				nearest=diff;
				ele=arr[i];
			}
		}
		System.out.println("Nearest Element is :- "+ele);
	}
	public static void main(String args[]){
		int arr[]={1,2,3,9,8,7,4,5};
		getNearest(arr,5);
	}
}