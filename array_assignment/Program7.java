class Program7{
	public static void main(String args[]){
		int arr[]={9,8,7,6,5,8,2,3,8,1,0,2,1};
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				secMin=min;
				min=arr[i];
			}
			else if(secMin>arr[i] && arr[i]!=min){
				secMin=arr[i];
			}
		}
		System.out.println("Second Smallest Elements :- "+secMin);
	}
}