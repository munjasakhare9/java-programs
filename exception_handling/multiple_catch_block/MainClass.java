class MainClass{
	public static void main(String args[]){
		System.out.println("Program started..");
		String s1[]={"123","222","111","100","124A"};
		int value=0;
		try{
			value=Integer.parseInt(s1[4].substring(1));
		}
		catch(NullPointerException e){
			System.out.println("catch block 1 called");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch block 2 called");
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("catch block 3 called");
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println("catch block 4 called");
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("catch block 5 called");
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("Program ended..");
	}
}