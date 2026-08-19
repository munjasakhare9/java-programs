import java.util.Arrays;
class NumberOfAtLast{
	public static void shiftEle(int arr[],int st, int ed){
		int len=arr.length;
		int start=st;
		int end=ed;
		if(start>=0&&start<len&&end>start&&end<len){
			while(start<end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			start=ed+1;
			end=len-1;
			while(start<end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
			start=st;
			end=len-1;
			while(start<end){
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9};
		shiftEle(a,1,3);
	}
}