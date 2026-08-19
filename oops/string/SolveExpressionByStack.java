import java.util.Stack;
class SolveExpressionByStack{
	public static void main(String args[]){
		String s1="10+20+10-20";
		Stack<Integer> stack=new Stack<>();
		Stack<Character> operator=new Stack<>();
		StringBuilder sb=new StringBuilder();
		int num=0;
		for(int i=s1.length()-1;i>=0;i--){
			char c=s1.charAt(i);
			if(Character.isDigit(c)){
				sb.append(c);
			}
			if(!Character.isDigit(c) || i==0){
				sb.reverse();
				num=Integer.parseInt(sb.toString());
				stack.push(num);
				sb.setLength(0);
				operator.push(c);
			}
		}
		char sign=operator.pop();
		while(!stack.isEmpty() && !operator.isEmpty()){
			char op=operator.pop();
			if(Character.isDigit(sign)){
				int a=stack.pop();
				int b=stack.pop();
				if(op=='+'){
					stack.push(a+b);
				}
				else if(op=='-'){
					stack.push(a-b);
				}
			}
			else{
				int a=stack.pop();
				int b=stack.pop();
				if(op=='+'){
					stack.push(a+b);
				}
				else if(op=='-'){
					stack.push(a-b);
				}
			}
		}
		System.out.println(stack);
		System.out.println(operator);
		System.out.println(stack.pop());
	}
}