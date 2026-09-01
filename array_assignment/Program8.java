class Program8{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9};
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			temp[i]=arr[i];
		}
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}