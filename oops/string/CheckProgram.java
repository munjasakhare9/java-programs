import java.util.Stack;
class CheckProgram {
    public static void main(String args[]) {

        String s1 = """
                public class A {
                    public static void main(String args[]) {
                        System.out.println("hello");
                    }
                
                """;
		s1=s1.replaceAll("[^{}\\[\\]()]","");
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c=='(' || c=='[' || c=='{'){
				stack.push(c);
			}
			else if(c==')' || c==']' || c=='}'){
				if(stack.isEmpty()){
					System.out.println(false);
					return;
				}
				char top=stack.pop();
				if((c==')' && top!='(') || (c==']' && top!=']') || (c=='{' && top !='}')){
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(stack.isEmpty());
        System.out.println(s1);
    }
}