class Demo2{
	int sumOfN(int n){
		if(n==1){//5==1
			return n;//1
		}
		return n+sumOfN(n-1);//
	}
}