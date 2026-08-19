class MainClass3{
	public static boolean checkPandrome(int num){
		int temp=num;
		int res=0;
		while(temp!=0){
			res=res*10+temp%10;
			temp/=10;
		}
		return (res==num);
	}
	public static void main(String args[]){
		int arr[]={101,202,121,10,7,22,1};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(checkPandrome(arr[i])){
				sum+=arr[i];
			}
		}
		
		System.out.println("The sum of palindrome element in array :- "+sum);
	}
}