class Listening implements Runnable{
	public void musicListening(){
		for(int i=1;i<=10;i++){
			System.out.println("music listening processing..");
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			
		}
	}
	
	public void run(){
		musicListening();
	}
}