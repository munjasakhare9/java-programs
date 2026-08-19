import java.util.Arrays;
class MergeSort{
    public static void main(String args[]){
	  int nums[]={6,2,1,9,4};
      divide(nums,0,nums.length-1);
	  System.out.println(Arrays.toString(nums));
    }
    private static void divide(int a[], int start, int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        divide(a,start,mid);
        divide(a,mid+1,end);
        conquer(a, start, mid, end);
    }

    private static void conquer(int a[], int start, int mid, int end){
        int arr[]=new int[end-start+1];

        int i=start, j=mid+1, k=0;
        while(i<=mid&&j<=end){
            arr[k++]=(a[i]<a[j])?a[i++]:a[j++];
        }
        while(i<=mid){
            arr[k++]=a[i++];
        }
        while(j<=end){
            arr[k++]=a[j++];
        }
		
		for (int x = 0; x < arr.length; x++) {
            a[start + x] = arr[x];
        }
    }
}