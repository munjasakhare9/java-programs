class Program4{
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,9,8,9,7,5,1};
		int speEle=9;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(speEle==arr[i]){
				count++;
			}
		}
		System.out.println("Frequency of "+speEle+" :- "+count);
	}
}