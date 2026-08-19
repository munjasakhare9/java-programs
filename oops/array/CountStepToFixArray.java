class CountStepToFixArray{
	public static void main(String args[]){
		int a[]={2,6,1};
		int count=countStepToFixArr(a);
		System.out.println(count);
	}
	private static double avgOfArray(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum/(double)a.length;
	}
	private static int countStepToFixArr(int a[]){
		double avg=avgOfArray(a);
		int count=0;
		if(avg%1!=0) return -1;
		for(int i=0;i<a.length;i++){
			if(a[i]<avg){
				count+=avg-a[i];
			}
		}
		return count;
	}
}