import java.util.HashSet;
import java.util.Set;
class UniqueEle{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,9,8,7,6,1,2,3,5,4,6,8,9,4};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		System.out.print(set);
	}
}