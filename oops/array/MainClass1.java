import java.util.Arrays;
class MainClass1{
	public static void main(String args[]){
		int arr1[]={10,20,30,40};
		int arr2[]={11,22,33,44};
		int res[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			res[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			res[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(res));
	}
}