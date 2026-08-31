class Program10{
	public static void main(String args[]){
		String s1="hello i am java developer";
		StringBuilder sb=new StringBuilder();
		String arr[]=s1.trim().split("\\s+");
		for(int i=0;i<arr.length;i++){
			String temp=arr[i];
			sb.append(Character.toUpperCase(temp.charAt(0)));
			sb.append(temp.substring(1));
			if(i < arr.length - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}