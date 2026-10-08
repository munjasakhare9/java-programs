class Program16b{
	static <T> int twoPointerSearch(T arr[], T key){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			if(arr[start]==key){
				return start;
			}
			else if(arr[end]==key){
				return end;
			}
			start++;
			end--;
		}
		return -1;
	}
	public static void main(String args[]){
		/*
		Integer arr[]={1,2,9,8,7,6,3,4,5};
		Integer key=6;
		*/
		String  arr[]={"Hello", "Good", "Hii", "Bye", "Fine", "Nice"};
		String key="Fine";
		System.out.println(twoPointerSearch(arr, key));
	}
}