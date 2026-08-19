import java.util.Arrays;
class ArrDoutes{
	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		int b[]=a;
		b[1]=100;
		b[2]=500;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
	}
}