import java.util.*;
class Compoundinterest{
	public static void main(String args[]){
		int p=10000;
		int r=10;
		int t=2;
		double amount = p * Math.pow((1 + r / 100.0), t);
		double ci=amount-p;
		System.out.println("Compound Interest :- "+ci);
		System.out.println("Total Amount :- "+amount);
		
	}
}