class Program25{
	
	static boolean isomorphicString(String s, String t){
		
		if(s.length() != t.length()){
			return false;
		}
		
		int[] mapS = new int[65536];
		int[] mapT = new int[65536];
		
		for(int i=0;i<s.length();i++){
			int c1=s.charAt(i);
			int c2=t.charAt(i);
			
			if(mapS[c1] != mapT[c2]){
				return false;
			}
			
			mapS[c1] = i + 1;
            mapT[c2] = i + 1;
		}
		
		return true;
	}
	public static void main(String args[]){
		String s="egg";
		String t="dad";
		System.out.println(isomorphicString(s,t));
	}
}