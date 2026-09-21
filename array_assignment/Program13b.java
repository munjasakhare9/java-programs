class Program13b{
	public static void main(String args[]){
		int arr[]={1,2,3,9,4,5,6,7,8,1,2,3,4,5,9,1,1};
		int frequency[]=new int[10];
		for(int i=0;i<arr.length;i++){
			int index=arr[i];
			frequency[index]++;
		}
		
		for(int i=0;i<frequency.length;i++){
			if(frequency[i]>1){
				System.out.print(i+" ");
			}
		}
	}
}