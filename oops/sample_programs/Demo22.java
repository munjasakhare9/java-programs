class Demo22{
	boolean checkPerfect(int n){
		if(n<0){
			return false;
		}
		for(int i=1;i*i<=n;i++){
			if((i*i)==n){
				return true;
			}
		}
		return false;
	}
}