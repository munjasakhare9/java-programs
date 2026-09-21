class Reading implements Runnable{
	public void bookReading(){
		for(int i=1;i<=10;i++){
			System.out.println("book reading processing..");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	
	public void run(){
		bookReading();
	}
}