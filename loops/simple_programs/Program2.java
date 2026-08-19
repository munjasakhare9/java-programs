class Program2{
	public static void main(String args[]){
		int a=10,b=50,c=30,d=40;
		if(a>b)
			if(a>c)
				if(a>d)
					System.out.println("a is bigger");
				else
					System.out.println("d is bigger");
			else
				if(c>d)
					System.out.println("c is bigger");
				else
					System.out.println("d is bigger");
		else
			if(b>c)
				if(b>d)
					System.out.println("b is bigger");
				else
					System.out.println("d is bigger");
			else
				if(c>d)
					System.out.println("c is bigger");
				else
					System.out.println("d is bigger");
	}
}