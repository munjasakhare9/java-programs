import java.util.Scanner;
class Program6{
	void printNToOne(int i, int n){
		if(i>n){
			return;
		}
		printNToOne(i+1,n);
		System.out.println(i);
	}
	public static void main(String args[]){
		Program6 p=new Program6();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		p.printNToOne(1,n);
	}
}