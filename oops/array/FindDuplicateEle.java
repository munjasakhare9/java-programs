import java.util.HashSet;
import java.util.Set;
class FindDuplicateEle{
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,9,1,5,7,2,1,6,4};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++){
			if(!set.add(a[i])){
				System.out.print(a[i]+" ");
			}
		}
	}
}