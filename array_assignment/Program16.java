class Program16{
	static <T> int linearSearch(T arr[], T key){
		for(int i=0;i<arr.length;i++){
			if(key.equals(arr[i])){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		String  arr[]={"Hello", "Good", "Hii", "Bye", "Fine", "Nice"};
		String key="Fine";
		System.out.println(linearSearch(arr,key)); 
	}
}