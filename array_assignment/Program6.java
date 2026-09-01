class Program6{
	public static void main(String args[]){
		int arr[]={1,2,5,6,7,9,8,4,2,5,6,9};
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				secondMax=max;
				max=arr[i];
			}
			else if(secondMax<arr[i] && arr[i]!=max){
				secondMax=arr[i];
			}
		}
		System.out.println("Second Maximum Element is :- "+secondMax);
	}
}