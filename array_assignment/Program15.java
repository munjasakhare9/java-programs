import java.util.Arrays;
class Program15{
	private static class Array{
		private int size=10;
		private int countElement=0;
		//int
		private Integer[] arr;
		private int i=-1;
		public Array(){
			arr=new Integer[size]; //int
		}
		
		public Array(int size){
			this.size=size;
			arr=new Integer[size];//int
		}
		public int add(int value) {
			if (countElement == arr.length) {
				size += size >> 1;
				arr = Arrays.copyOf(arr, size);
			}

			arr[countElement] = value;
			countElement++;
			return value;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");

			for (int j = 0; j < countElement; j++) {
				sb.append(arr[j]);
				if (j < countElement - 1) {
					sb.append(",");
				}
			}
			sb.append("]");
			return sb.toString();
		}
		
		public int size(){
			return countElement;
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
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);		
		
		System.out.println(arr);
		System.out.println(arr.size());
	}
}