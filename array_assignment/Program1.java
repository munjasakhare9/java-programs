class Program1{
	public static void main(String args[]){
		int arr[]={4,8,3,7,9,5,6};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("min="+min+" max="+max);
	}
}