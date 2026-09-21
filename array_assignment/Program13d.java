import java.util.HashSet;
class Program13d{
	public static void main(String args[]){
		int arr[]={1,2,3,9,4,5,6,7,8,1,2,3,4,5,9,1,1};
		HashSet<Integer> hashSet=new HashSet<>();
		HashSet<Integer> duplicates=new HashSet<>();
		for(int i=0;i<arr.length;i++){
			if(!hashSet.add(arr[i])){
				duplicates.add(arr[i]);
			}
		}
		System.out.println(duplicates);
	}
}