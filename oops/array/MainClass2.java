import java.util.Arrays;
class MainClass2{
	public static void main(String args[]){
		int arr1[]={10,20,30,40};
		int arr2[]={11,22,33,44};
		int res[]=new int[arr1.length+arr2.length];
		int len=arr1.length+arr2.length;//8
		int count1=0;
		int count2=0;
		for(int i=0;i<len;i++){//8
			if(count1<arr1.length){
				res[i]=arr1[count1];
				count1++;
				i+=1;
			}
			if(count2<arr2.length){
				res[i]=arr2[count2];
				count2++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}