class Program24Ex2{
	public static void main(String args[]){
		String str="Hello i am java developer";
		String arr[]=str.trim().split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++){
			sb.append(new StringBuilder(arr[i]).reverse());
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(new String(sb));
	}
}