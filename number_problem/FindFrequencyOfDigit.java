class FindFrequencyOfDigit{
	public static void main(String args[]){
		int num=1231245;
		int arr[]=new int[10];
		int temp=num;
		while(temp!=0){
			int digit=temp%10;
			arr[digit]++;
			temp/=10;
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				System.out.println(i+"="+arr[i]);
			}
		}
	}
}