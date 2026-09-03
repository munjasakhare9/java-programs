class Program11b{
	public static void main(String args[]){
		String s1=" hello i am java		 developer ";
		String arr[]=s1.trim().split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}