import java.util.Arrays;
class ExchangeSort{
	public static void main(String args[]){
		int arr[]={8,9,6,2,7,5,4,8,3,1,5,2};
		exchangeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	private static void exchangeSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}