import java.util.Scanner;

public class Eval {
	public static int evaluate(String expression) {
		Scanner scanner = new Scanner(expression);
		// Initialize a stack.
		
		Stack<Integer> stack = new Stack<>();
		// Parse each token in the postfix expression.
		
		while (scanner.hasNext()) {
			String token = scanner.next();
			// If the current token is an operand, push it onto the stack.
			if (Character.isDigit(token.charAt(0))) { stack.push(Integer.valueOf(token)); }
			else {
				// Pop the right operand from the stack.
				int right = stack.pop();
				// Pop the left operand from the stack.
				int left = stack.pop();
				// Push the evaluation result onto the stack.
				if (token.equals("^")) { stack.push((int)(Math.pow(left, right))); }
				if (token.equals("%")) { stack.push(left % right); }
				if (token.equals("+")) { stack.push(left + right); }
				if (token.equals("-")) { stack.push(left - right); }
				if (token.equals("*")) { stack.push(left * right); }
				if (token.equals("/")) {
					if (right == 0) { throw new IllegalArgumentException("Divide by zero."); }
		                    stack.push(left / right);
				}
			}
		}
		        scanner.close();
		// The only value in the stack is the evaluation result.
		return stack.peek();
	}  // Time complexity: O(n)
}
