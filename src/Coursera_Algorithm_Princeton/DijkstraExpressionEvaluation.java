package Coursera_Algorithm_Princeton;

import java.util.Stack;

public class DijkstraExpressionEvaluation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operation = "(1+((2+3)*(4*5))"; 
		Stack<Character> ops = new Stack<Character>();
		Stack<Double> vals = new Stack<Double>();
		
		for(int i = 0; i < operation.length(); i++) {
			char c = operation.charAt(i);
			if (c == '(') ;
			else if (c == '+') ops.push(c);
			else if (c == '-') ops.push(c);
			else if (c == '*') ops.push(c);
			else if (c == '/') ops.push(c);
			else if (c == ')') { continue;
//				char op = ops.pop();
//				double val = vals.pop();
				//System.out.println(val + vals.pop());
//				if (op == '+') val += vals.pop();
//				else if (op == '-') val -= vals.pop();
//				else if (op == '*') val = vals.pop() * val;
//				else if (op == '/') val /= vals.pop();
//				else if (op == '-') val -= vals.pop();
//				else vals.push(val);
//		
			}
			
			else vals.push((double) (c - '0'));
		}
		while (!vals.isEmpty()) {
			System.out.println(vals.pop());
		}
		

	//	System.out.println(vals.pop());

	}

}
