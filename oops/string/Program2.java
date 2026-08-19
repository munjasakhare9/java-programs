class Program2{
	public static void main(String args[]){
		String s1="hello i am java developer";
		String s2[]=s1.trim().split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s2.length-1;i++){
			for(int j=0;j<s2.length-i-1;j++){
				if(s2[j].compareTo(s2[j+1])<=0){
					String temp=s2[j+1];
					s2[j+1]=s2[j];
					s2[j]=temp;
				}
			}
			System.out.print(s2[i]+" ");
		}
	}
}