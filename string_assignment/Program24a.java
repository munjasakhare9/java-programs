class Program24a{
	public static void main(String args[]){
		String str="Hello i am java developer";
		String arr[]=str.trim().split("\\s+");
		int i=0, j=arr.length-1;
		while(i<j){
			String temp=arr[i]; 
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int k=0;k<arr.length;k++){
			sb.append(arr[k]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1); 
		
		System.out.println(sb.toString());
	}
}