class Demo10{
	int swapFirstAndLast(int n){
		if(n>9){
			int last=n%10;
			int power=1;
			n/=10;
			int first=n;
			while(first>9){
				power*=10;
				first/=10;
			}
			n%=power;
			last*=power;
			n+=last;
			n*=10;
			n+=first;
		}
		return n;
	}
}