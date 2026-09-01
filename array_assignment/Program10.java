class Program10{
	public static void  main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8,9,-1,-6,-8,-7,-3,0,0,0,0,-7,-2};
		int pos=0, neg=0, zero=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				neg++;
			}
			else if(arr[i]==0){
				zero++;
			}
			else{
				pos++;
			}
		}
		System.out.println("Negative Count :- "+neg+" \nZero Count :- "+zero+" \nPositive Count :- "+pos);
	}
}