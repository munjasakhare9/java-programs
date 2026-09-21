class MainClass{
	public static void main(String args[]){
		Reading r=new Reading();
		Writing w=new Writing();
		Listening l=new Listening();
		w.start();
		r.start();
		l.start();
	}
}