class FindAdjecantEle2{
	public static void findAdjecant(int arr[], int index){
		int right=Integer.MAX_VALUE;
		int left=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(index!=i&&arr[index]<=arr[i]&&right>=arr[i]){
				right=arr[i];
			}
			else if(index!=i&&arr[index]>=arr[i]&&left<=arr[i]){
				left=arr[i];
			}
		}
		System.out.println("left="+left+" num="+arr[index]+" right="+right);
	}
	public static void main(String args[]){
		int arr[]={5,6,4,8,-1,-10,2,2,7,9,3,3,1,0,-5,6};
		findAdjecant(arr,2);
	}
}