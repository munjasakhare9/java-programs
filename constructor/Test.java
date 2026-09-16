public class Test {
    // The helper method executes to initialize the variable
    int x = printAndReturn(); 

    public int printAndReturn() {
        System.out.println("Printing via variable initialization!");
        return 10;
    }
	
	public static void main(String args[]){
		Test t=new Test();
		System.out.println();
	}
}