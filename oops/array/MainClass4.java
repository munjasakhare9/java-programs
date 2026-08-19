class MainClass4{
	public static void main(String args[]){
		int arr[]={10,20,55,40,60,80,90};
		int key=55;
		boolean b=false;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				b=true;
				System.out.println("Element found at :- "+i);
			}
		}
		if(!b){
			System.out.println("Element not found.");
		}
	}
}
