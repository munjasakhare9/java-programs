import java.util.Scanner;
class Program4{
	void printNToZero(int n){
		if(n<1){
			return;
		}
		System.out.println(n);
		printNToZero(n-1);
		
	}
	public static void main(String args[]){
		Program4 p=new Program4();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		p.printNToZero(n);
	}
}