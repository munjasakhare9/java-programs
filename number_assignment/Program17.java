class Program17{
	public static void main(String args[]){
		int num=1234567891;
		int arr[]=new int[10];
		int temp=num;
		while(temp!=0){
			int digit=temp%10;
			arr[digit]++;
			temp/=10;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>1){
				System.out.println(num+" number contains repeating digits :- "+i);
				return;
			}
		}
		System.out.println(num+" number does not contains any repeating digits..");
	}
}