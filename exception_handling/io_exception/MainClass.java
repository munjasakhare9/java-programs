import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MainClass{
	public static void main(String args[]){
		System.out.println("program started");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter value :- ");
		String value=null;
		try{
			value=br.readLine();
		}
		catch(IOException e){
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("program ended");
		
	}
}