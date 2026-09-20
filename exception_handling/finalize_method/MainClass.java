class MainClass{
	public static void main(String args[]){
		System.out.println("program started..");
		for(int i=1;i<=10;i++){
			new MainClass();
		}
		System.gc();
		System.out.println("program ended..");
	}
	protected void finalize(){
		System.out.println("finalize method called..");
	}
}