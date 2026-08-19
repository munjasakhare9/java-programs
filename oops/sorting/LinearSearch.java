class LinearSearch{
	public static void main(String args[]){
		int a[]={7,8,6,9,2,5,1,3,4};
		int key=9;
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(key==a[i]){
				index=i;
				break;
			}
		}
		System.out.println(index);
	}
}