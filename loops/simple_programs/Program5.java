class Program5{
	public static void main(String args[]){
		int a=100,b=200,c=300,d=40;
		String ans=(a>b)?(a>c)?(a>d)?"a is bigger":"d is bigger":(c>d)?"c is bigger":"d is bigger":(b>c)?(b>d)?"b is bigger":"d is bigger":(c>d)?"c is bigger":"d is bigger";
		System.out.println(ans);
	}
}