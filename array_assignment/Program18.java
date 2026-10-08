class Program18{
	private static int[] bubbleSort(int arr[]){
		for(int i=0;i<arr.length;i++){
			boolean isSorted=true;
			for(int j=0;j<arr.length- 1 - i; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSorted=false;
					
				}
			}
			
			if(isSorted){
				break;
			}
		}
		return arr;
	}
	public static void main(String args[]){
		int arr[]={1,4,7,0,2,5,8,3,6,9};
		//System.out.println(bubleSort(arr));
		bubbleSort(arr);
		
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}