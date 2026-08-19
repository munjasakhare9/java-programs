class Programv3
 {
	public static void main(String args[])
	{
		int n=5;
		
		char ch='A';
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print("1");
				}
			}
					System.out.println();
		}
	}
}	