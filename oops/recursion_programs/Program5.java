import java.util.Scanner;
class Program5{
	void printOneTON(int n){
		if(n<1){
			return;
		}
		printOneTON(n-1);
		System.out.println(n);
	}
	public static void main(String args[]){
		Program5 p=new Program5();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		p.printOneTON(n);
	}
}
