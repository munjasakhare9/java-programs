class InvalidAgeException extends RuntimeException{
	private String msg="invalid age!!!";
	public InvalidAgeException(String msg){
		this.msg=msg;
	}
	public InvalidAgeException(){};
	
	public String toString(){
		return getClass().getName()+": "+msg;
	}
}