package Program15b;
public class DynamicArray<T>{
	private Integer[] arr;
	private int size=0;
	
	public DynamicArray(){
		arr=new Integer[10];
	}
	
	public DynamicArray(int customizedSize){
		arr=new Integer[customizedSize];
	}
	
	public void add(Integer value){
		if(size==arr.length){
			int len=arr.length+(arr.length>>1);
			Integer[] newArr=new Integer[len];
			for(int i=0;i<arr.length;i++){
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		
		arr[size]=value;
		size++;
	}
	
	public String toString(){
		if(arr.length==0){
			return "[]";
		}
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<size;i++){
			sb.append(arr[i]+",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		
		return new String(sb);
	}
}