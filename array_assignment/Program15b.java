import Program15b.DynamicArray;
class Program15b{
	public static void main(String args[]){
		DynamicArray<Integer> da=new DynamicArray<>();
		da.add(10);
		da.add(20);
		da.add(30);
		da.add(40);
		da.add(50);
		
		da.add(60);
		da.add(70);
		da.add(80);
		da.add(90);
		da.add(100);
		
		da.add(10);
		da.add(20);
		da.add(30);
		da.add(40);
		da.add(50);
		da.add(60);
		da.add(null);
		da.add(null);
		da.add(null);
		System.out.println(da);
	}
}