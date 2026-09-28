import java.util.Arrays;
class Program15{
	private static class Array{
		private int size=10;
		private int[] arr;
		private int i=-1;
		public Array(){
			arr=new int[size];
		}
		
		public Array(int size){
			this.size=size;
			arr=new int[size];
		}
		public int add(int value){
			i++;
			try{
				arr[i]=value;
			}
			catch(ArrayIndexOutOfBoundsException e){
				size+=size>>1;
				arr= Arrays.copyOf(arr, size);
				arr[i]=value;
			}
			return value;
		}
		
		public String toString(){
			StringBuilder sb=new StringBuilder();
			sb.append("[");
			for(int i:arr){
				sb.append(i+",");
			}
			sb.deleteCharAt(sb.length()-1);
			sb.append("]");
			return new String(sb);
		}
		
		public int size(){
			return arr.length;
		}
	}
	
	public static void main(String args[]){
		Array arr=new Array();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		arr.add(500);
		arr.add(2000000);
		System.out.println(arr);
		System.out.println(arr.size());
	}
}