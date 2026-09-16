class CmdArgs{
	public static void main(String args[]){
		System.out.println ("Total Cmd Args :: " + args.length );

		String s1 = args[0];

		String s2 = args[1];

		int x = Integer.parseInt (s1);
		int y = Integer.parseInt(s2);

		System.out.println (x + y);
		
		int sum=0;
		for(String i:args){
			int num=Integer.parseInt(i);
			sum+=num;
		}
		System.out.println("Sum of total Element :- "+sum);
	}	
}