package strings;


import java.util.Map;
import java.util.Stack;

//ð�—£ð�—®ð�—¿ð�—²ð�—»ð�˜�ð�—µð�—²ð�˜€ð�—¶ð�˜€ ð�˜„ð�—¶ð�˜�ð�—µ ð�—¦ð�˜�ð�—®ð�—°ð�—¸: 
//Given a string containing just the characters (, ), {, }, [ and ], 
//determine if the input string is valid.
//Examples:
//Input: {[()]} â†’ Valid
//Input: {[(])} â†’ Invalid
//Input: ((())) â†’ Valid
//Input: ([)] â†’ Invalid
public class String_Stack {
//We use stack because it follows LIFO (Last In, First Out), 
//which perfectly fits checking properly nested structures.
	
	public static void main(String[] args) {
		
		String input = "{[()]}";  // You can test other strings here
		System.out.println("Input: " + input);

        boolean isValid = isValidParentheses(input);
        System.out.println("Is valid? " + isValid); 
	}
	
	private static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
    // If it's an opening bracket, push the corresponding closing bracket
        	 if (ch == '(') {
                 stack.push(')');
        	 } else if (ch == '{') {
                 stack.push('}');
        	 } else if (ch == '[') {
                 stack.push(']');
             } // Closing bracket check
             else {
    // If stack is empty OR top of stack doesn't match current character
                 if (stack.isEmpty() || stack.pop() != ch) {
                     return false;
                 }
            }
       }
// If the stack is empty after processing the entire string â‡’ all brackets matched correctly.
        return stack.isEmpty();
	}
	
	private static boolean isValid_Simple(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character,Character> pairs=Map.of(')', '(', '[', ']', '{', '}');
		
		for(char ch:s.toCharArray()) {
			if(pairs.containsValue(ch)) {stack.push(ch);}
			else if(pairs.containsKey(ch)) {
				if(stack.isEmpty() || stack.pop()!= pairs.get(ch)) {return false;}
			}
		}
		return stack.isEmpty();
	}
}
