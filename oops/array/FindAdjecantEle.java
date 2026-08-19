class FindAdjecantEle{
	public static void findAdjecant(int arr[], int num){
		int right=Integer.MAX_VALUE;
		int left=Integer.MIN_VALUE;
		
		for(int n:arr){
			if(num<n&&right>n){
				right=n;
			}
			if(num>n&&left<n){
				left=n;
			}
		}
		System.out.println("left="+left+" num="+num+" right="+right);
	}
	public static void main(String args[]){
		int arr[]={5,6,4,8,-1,-10,2,2,7,9,3,1,0,-5,6};
		findAdjecant(arr,1);
	}
}