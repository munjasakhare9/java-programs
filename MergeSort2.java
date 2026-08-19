import java.util.Arrays;
class MergeSort2{
	private static void divide(int arr[], int si, int ei){
		if(si>=ei){
			return;
		}
		int mid = si+(ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr, si, mid, ei);
	}
	private static void conquer(int arr[], int si, int mid, int ei){
		int len=(ei-si+1);
		int mergeArr[]=new int[len];
		int i=si, j=mid+1, k=0;
		while(i<=mid && j<=ei){
			mergeArr[k++]=(arr[i]<=arr[j])?arr[i++]:arr[j++];
		}
		while(i<=mid){
			mergeArr[k++]=arr[i++];
		}
		while(j<=ei){
			mergeArr[k++]=arr[j++];
		}
		
		for(int x=0, y=si;x<mergeArr.length;x++, y++){
			arr[y]=mergeArr[x];
		}
	}
	public static void main(String args[]){
		int arr[]={1,9,6,7,5,4};
		divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}