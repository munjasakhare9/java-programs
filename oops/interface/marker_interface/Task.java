class Task{
	public void completeProcess(Object o){
		if(o instanceof Marker){
			System.out.println(o);
		}
		else{
			throw new RuntimeException("object not supported!!!!");
		}
	}
}