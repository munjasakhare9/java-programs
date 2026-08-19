class ShiftWovelsAtLast{
	public static void main(String args[]){
		String s1="India";
		char arr[]=s1.toCharArray();
		int k=0;
		for(int i=0;i<arr.length-1;i++){
			char c=arr[i];
			if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
				k++;
				for(int j=i;j<arr.length-k;j++){
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		String s=new String(arr);
		System.out.println(s);
	}
}