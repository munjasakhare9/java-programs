class Program13{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,1,2,3,4,5,9,1,1};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]);
				}
			}
		}
	}
}