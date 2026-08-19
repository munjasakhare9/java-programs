class SumOf3Element{
	public static void main(String args[]){
		int a[]={10,50,60,30,40,80,90,70};
		int key=120;
		int len=a.length;
		for(int i=0;i<len-2;i++){
			for(int j=i+1;j<len;j++){
				for(int k=j+1;k<len;k++){
					int sum=a[i]+a[j]+a[k];
					if(sum==key){
					System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]);
					}
				}
			}
		}
	}
}