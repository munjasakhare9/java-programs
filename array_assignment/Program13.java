class Program13{
	public static void main(String args[]){
		int arr[]={1,2,3,9,4,5,6,7,8,1,2,3,4,5,9,1,1};
		for(int i=0;i<arr.length;i++){
			
			boolean isAlreadyPrinted=false;
			for(int k=0;k<i;k++){
				if(arr[k]==arr[i]){
					isAlreadyPrinted=true;
					break;
				}
			}
			if(isAlreadyPrinted){
				continue;
			}
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}
}