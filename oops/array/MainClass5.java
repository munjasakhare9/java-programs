class MainClass5{
	public static void main(String args[]){
		int arr[]={55,110,60,50,90,70,};
		int sum=140;
		boolean b=false;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j])==sum){
					b=true;
					System.out.println(sum+" is sum of :- "+arr[i]+" "+arr[j]);
				}
			}
		}
		if(!b){
			System.out.println("Number not found.");
		}
	}
}