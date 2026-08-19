import java.util.Arrays;
class QuickSort{
	public static void main(String args[]){
		int a[]={5,6,7,9,3,4,1};
		divide(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	private static void divide(int a[], int low, int high){
		if(low<high){
			int pi=partition(a, low, high);
			divide(a, low, pi-1);
			divide(a, pi+1, high);
		}
	}
	private static int partition(int a[], int low, int high){
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(a[j]<pivot){
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		i++;
		int temp=a[i];
		a[i]=a[high];
		a[high]=temp;
		return i;
		
	}
}