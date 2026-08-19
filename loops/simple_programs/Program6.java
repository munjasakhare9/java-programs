class Program6{
	public static void main(String args[]){
		int a=100,b=200,c=300,d=400,e=50;
		String ans=(a>b)?(a>c)?(a>d)?(a>e)?"a is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(b>c)?(b>d)?(b>e)?"b is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger";
		System.out.println(ans);
	}
}


