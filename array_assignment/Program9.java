class Program9{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9};
		int evenCount=0;
		int oddCount=0;
		System.out.println("Even Elements :- ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				System.out.print(arr[i]+" ");
				evenCount++;
			}
		}
		System.out.println("Even Elements count :- "+evenCount);
		
		System.out.println("Odd Elements :- ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				System.out.print(arr[i]+" ");
				oddCount++;
			}
		}
		System.out.println("Odd Elements count :- "+oddCount);
	}
}