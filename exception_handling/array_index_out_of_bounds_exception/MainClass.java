class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		int arr[]={1,2,3,4,5};
		int value=0;
		try{
			value=arr[7];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("program ended..");
	}
}