
//1.creat a stack and implement it using the inbuilt classes and methods.
//2.access element of stack
//// implimentation of stack

import java.util.stack;

public class StackSolution {
	public static void main(String[] args) {
		//Stack s1 = new stack();
		Stack<Integer> s1 = new Stack<>();
		
		s1.push(2);
		s1.push(4);
		s1.push(9);
		
		System.out.println(s1);
		
	}
}
