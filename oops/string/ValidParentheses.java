import java.util.Stack;
class ValidParentheses{
	public static void main(String args[]){
		String s1="{}{}{}";
		//output :- true
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s1.length();i++){
			char c=s1.charAt(i);
			if(c=='{'){
				stack.push(c);
			}
			else if(c=='}'){
				if(stack.isEmpty()){
					System.out.println(false);
					return;
				}
				char top=stack.pop();
				if(top !='{'){
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(stack.isEmpty());
	}
}